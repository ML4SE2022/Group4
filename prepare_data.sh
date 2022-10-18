mkdir vectors
echo batch 1/6
python3 methods_to_vectors_new.py data/train.java-cs.txt.cs vectors/train.t5.cs c_sharp t5
python3 methods_to_vectors_new.py data/train.java-cs.txt.cs vectors/train.t5unique.cs c_sharp t5unique
python3 methods_to_vectors_new.py data/train.java-cs.txt.cs vectors/train.unixcoder.cs c_sharp unixcoder
echo batch 2/6
python3 methods_to_vectors_new.py data/train.java-cs.txt.java vectors/train.t5.java java t5
python3 methods_to_vectors_new.py data/train.java-cs.txt.java vectors/train.t5unique.java java t5unique
python3 methods_to_vectors_new.py data/train.java-cs.txt.java vectors/train.unixcoder.java java unixcoder
echo batch 3/6
python3 methods_to_vectors_new.py data/test.java-cs.txt.cs vectors/test.t5.cs c_sharp t5
python3 methods_to_vectors_new.py data/test.java-cs.txt.cs vectors/test.t5unique.cs c_sharp t5unique
python3 methods_to_vectors_new.py data/test.java-cs.txt.cs vectors/test.unixcoder.cs c_sharp unixcoder
echo batch 4/6
python3 methods_to_vectors_new.py data/test.java-cs.txt.java vectors/test.t5.java java t5
python3 methods_to_vectors_new.py data/test.java-cs.txt.java vectors/test.t5unique.java java t5unique
python3 methods_to_vectors_new.py data/test.java-cs.txt.java vectors/test.unixcoder.java java unixcoder
echo batch 5/6
python3 methods_to_vectors_new.py data/valid.java-cs.txt.cs vectors/valid.t5.cs c_sharp t5
python3 methods_to_vectors_new.py data/valid.java-cs.txt.cs vectors/valid.t5unique.cs c_sharp t5unique
python3 methods_to_vectors_new.py data/valid.java-cs.txt.cs vectors/valid.unixcoder.cs c_sharp unixcoder
echo batch 6/6
python3 methods_to_vectors_new.py data/valid.java-cs.txt.java vectors/valid.t5.java java t5
python3 methods_to_vectors_new.py data/valid.java-cs.txt.java vectors/valid.t5unique.java java t5unique
python3 methods_to_vectors_new.py data/valid.java-cs.txt.java vectors/valid.unixcoder.java java unixcoder
