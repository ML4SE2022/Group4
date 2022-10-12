import numpy
from tree_sitter import Language, Parser

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

	for method in methods:
		vector = get_ast_identifier_vector(method, language=language)

		with open(output_file, "a") as vec_store:
		    vec_store.write(str(vector) + '\n')


# delete the .vec files before running this again
if __name__ == "__main__":
	convert_methods_and_write_vec('data/train.java-cs.txt.java', 'vec/train.java-cs.txt.java.vec', 'java')
	convert_methods_and_write_vec('data/train.java-cs.txt.cs', 'vec/train.java-cs.txt.cs.vec', 'c-sharp')

	print('.vec files have been updated.')
