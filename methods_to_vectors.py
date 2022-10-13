import numpy
from tree_sitter import Language, Parser
import sys

accepted_languages = ["java", "c-sharp"]

Language.build_library(
  # Store the library in the `build` directory
  'build/my-languages.so',

  # Include one or more languages
  [
    'tree-sitter-java',
    'tree-sitter-c-sharp'
  ]
)


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


def get_ast_identifier_vector(full_method, language="java"):
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


def convert_methods_and_write_vec(target_file, output_file, language):
    with open(target_file) as f:
        methods = [line.rstrip() for line in f]

    vector = ""
    for method in methods:
        vector += str(get_ast_identifier_vector(method, language=language))+'\n'

    with open(output_file, "w") as vec_store:
        vec_store.write(vector)

def main():
    input_file = sys.argv[1]
    output_file = sys.argv[2]
    language = sys.argv[3]
    assert language in accepted_languages
    
    convert_methods_and_write_vec(input_file, output_file, language)

    print('.vec files have been updated.')

if __name__ == "__main__":
    main()
