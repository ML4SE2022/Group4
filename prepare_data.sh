mkdir prepared
python methods_to_vectors_new.py data/train.java-cs.txt.cs prepared/train.t5.cs c-sharp t5
python methods_to_vectors_new.py data/train.java-cs.txt.cs prepared/train.t5unique.cs c-sharp t5unique
python methods_to_vectors_new.py data/train.java-cs.txt.cs prepared/train.unixcoder.cs c-sharp unixcoder

python methods_to_vectors_new.py data/train.java-cs.txt.java prepared/train.t5.java c-sharp t5
python methods_to_vectors_new.py data/train.java-cs.txt.java prepared/train.t5unique.java c-sharp t5unique
python methods_to_vectors_new.py data/train.java-cs.txt.java prepared/train.unixcoder.java c-sharp unixcoder

python methods_to_vectors_new.py data/test.java-cs.txt.cs prepared/test.t5.cs c-sharp t5
python methods_to_vectors_new.py data/test.java-cs.txt.cs prepared/test.t5unique.cs c-sharp t5unique
python methods_to_vectors_new.py data/test.java-cs.txt.cs prepared/test.unixcoder.cs c-sharp unixcoder

python methods_to_vectors_new.py data/test.java-cs.txt.java prepared/test.t5.java c-sharp t5
python methods_to_vectors_new.py data/test.java-cs.txt.java prepared/test.t5unique.java c-sharp t5unique
python methods_to_vectors_new.py data/test.java-cs.txt.java prepared/test.unixcoder.java c-sharp unixcoder

python methods_to_vectors_new.py data/valid.java-cs.txt.cs prepared/valid.t5.cs c-sharp t5
python methods_to_vectors_new.py data/valid.java-cs.txt.cs prepared/valid.t5unique.cs c-sharp t5unique
python methods_to_vectors_new.py data/valid.java-cs.txt.cs prepared/valid.unixcoder.cs c-sharp unixcoder

python methods_to_vectors_new.py data/valid.java-cs.txt.java prepared/valid.t5.java c-sharp t5
python methods_to_vectors_new.py data/valid.java-cs.txt.java prepared/valid.t5unique.java c-sharp t5unique
python methods_to_vectors_new.py data/valid.java-cs.txt.java prepared/valid.unixcoder.java c-sharp unixcoder