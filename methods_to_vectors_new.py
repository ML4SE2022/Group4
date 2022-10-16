import numpy
from UniXcoder import preprocess
from tree_sitter import Language, Parser
import os
import sys
import torch
from transformers import RobertaTokenizer, RobertaConfig, RobertaModel
from transformers import AutoTokenizer, AutoModel

device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
tokenizer = RobertaTokenizer.from_pretrained("microsoft/codebert-base")
model = RobertaModel.from_pretrained("microsoft/codebert-base")
model.to(device)

Language.build_library(
  # Store the library in the `build` directory
  'build/my-languages.so',

  # Include one or more languages
  [
    'tree-sitter-java',
    'tree-sitter-c-sharp'
  ]
)

# Stolen from some Github issue, need to find the link for reference
def traverse_tree(tree):
    cursor = tree.walk()

    reached_root = False
    while reached_root == False:
        yield cursor.node

        if cursor.goto_first_child():
            continue

        if cursor.goto_next_sibling():
            continue

        retracing = True
        while retracing:
            if not cursor.goto_parent():
                retracing = False
                reached_root = True

            if cursor.goto_next_sibling():
                retracing = False

# CodeT5
def get_ast_vector_codet5(full_method, language="java"):
    C_SHARP_LANGUAGE = Language('build/my-languages.so', 'c_sharp')
    JAVA_LANGUAGE = Language('build/my-languages.so', 'java')

    parser = Parser()

    if language == "java":
        parser.set_language(JAVA_LANGUAGE)
        # to fix a missing anonymous node which happens for some reasons with java 
        # if the class is not specified.
        full_method = "public class App {" + full_method + "}"
    else:
        parser.set_language(C_SHARP_LANGUAGE)

    data = full_method
    byte = bytearray(data.encode())
    tree = parser.parse(byte)

    vector = []

    for node in traverse_tree(tree):
        if node.is_named:
            vector.append(node.type)

    if language == "java":
        return [1 if item == 'identifier' else 0 for item in vector[5:]]
    else:
        return [1 if item == 'identifier' else 0 for item in vector]


# CodetT5 unique identifiers all recieve a unique identifer instead of just 
# every single one recieve 1
def get_ast_vector_unique_codet5(full_method, language="java"):
    C_SHARP_LANGUAGE = Language('build/my-languages.so', 'c_sharp')
    JAVA_LANGUAGE = Language('build/my-languages.so', 'java')

    parser = Parser()

    if language == "java":
        parser.set_language(JAVA_LANGUAGE)
        # to fix a missing anonymous node which happens for some reasons with java 
        # if the class is not specified.
        full_method = "public class App {" + full_method + "}"
    else:
        parser.set_language(C_SHARP_LANGUAGE)

    data = full_method
    byte = bytearray(data.encode())
    tree = parser.parse(byte)

    nodes = []

    identifiers = []
    identifiers_ids = {}

    for node in traverse_tree(tree):
        if node.is_named:
            if node.type == "identifier":
                identifiers.append(full_method[node.start_byte:node.end_byte])

            nodes.append(node)

    if language == "java":
        nodes = nodes[5:]

    init_id = 0

    for identifier in identifiers:
        if identifier not in identifiers_ids:
            identifiers_ids[identifier] = init_id
            init_id += 1

    vector = []

    for node in nodes:
        node_body = full_method[node.start_byte:node.end_byte]

        if node_body in identifiers:
            vector.append(identifiers_ids[node_body])
        else:
            vector.append(0)

    return vector


def write_vectors_to_file(vectors, output_file):
    vector_output = ""
    for vector in vectors:
        vector_output += str(vector) + '\n'
        
    with open(output_file, "w") as vec_store:
        vec_store.write(vector_output)


def convert_methods_and_write_vec(input_file, output_file, method, language):

    with open(input_file) as f:
        lines = [line.rstrip() for line in f]

    vectors = list()
    for line in lines:
        if method == "t5":
            vectors.append(get_ast_vector_codet5(line, language=language))
        elif method == "unixcoder":
            vectors.append(preprocess.AST(line, language, tokenizer))
        elif method == "t5unique":
            vectors.append(get_ast_vector_unique_codet5(line, language))

        write_vectors_to_file(vectors, output_file)

def main():
    if len(sys.argv) != 5:
        print("use: input_file, output_file, [java, c-sharp], [t5, t5unique, unixcoder]")
        sys.exit()
    
    input_file = sys.argv[1]
    output_file = sys.argv[2]
    language = sys.argv[3]
    method = sys.argv[4]
    
    accepted_languages = ["java", "c-sharp"]
    accepted_methods = ["t5", "t5unique", "unixcoder"]
    
    assert language in accepted_languages
    assert method in accepted_methods
    
    convert_methods_and_write_vec(input_file, output_file, method, language)

if __name__ == "__main__":
    main()
