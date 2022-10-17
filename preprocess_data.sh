mkdir preprocessed
echo batch 1/6
python preprocessed.py data/train.java-cs.txt.cs vectors/train.t5.cs preprocessed/train.t5.cs
python preprocessed.py data/train.java-cs.txt.cs vectors/train.t5unique.cs preprocessed/train.t5unique.cs
python preprocessed.py data/train.java-cs.txt.cs vectors/train.unixcoder.cs preprocessed/train.unixcoder.cs
echo batch 2/6
python preprocessed.py data/train.java-cs.txt.java vectors/train.t5.java preprocessed/train.t5.java
python preprocessed.py data/train.java-cs.txt.java vectors/train.t5unique.java preprocessed/train.t5unique.java
python preprocessed.py data/train.java-cs.txt.java vectors/train.unixcoder.java preprocessed/train.unixcoder.java
echo batch 3/6
python preprocessed.py data/test.java-cs.txt.cs vectors/test.t5.cs preprocessed/test.t5.cs
python preprocessed.py data/test.java-cs.txt.cs vectors/test.t5unique.cs preprocessed/test.t5unique.cs
python preprocessed.py data/test.java-cs.txt.cs vectors/test.unixcoder.cs preprocessed/test.unixcoder.cs
echo batch 4/6
python preprocessed.py data/test.java-cs.txt.java vectors/test.t5.java preprocessed/test.t5.java
python preprocessed.py data/test.java-cs.txt.java vectors/test.t5unique.java preprocessed/test.t5unique.java
python preprocessed.py data/test.java-cs.txt.java vectors/test.unixcoder.java preprocessed/test.unixcoder.java
echo batch 5/6
python preprocessed.py data/valid.java-cs.txt.cs vectors/valid.t5.cs preprocessed/valid.t5.cs
python preprocessed.py data/valid.java-cs.txt.cs vectors/valid.t5unique.cs preprocessed/valid.t5unique.cs
python preprocessed.py data/valid.java-cs.txt.cs vectors/valid.unixcoder.cs preprocessed/valid.unixcoder.cs
echo batch 6/6
python preprocessed.py data/valid.java-cs.txt.java vectors/valid.t5.java preprocessed/valid.t5.java
python preprocessed.py data/valid.java-cs.txt.java vectors/valid.t5unique.java preprocessed/valid.t5unique.java
python preprocessed.py data/valid.java-cs.txt.java vectors/valid.unixcoder.java preprocessed/valid.unixcoder.java
