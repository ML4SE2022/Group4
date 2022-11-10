# Fine-tuning CodeBERT with AST-based Vectors for Code Translation

The ability to translate one programming language (PL) to another programming language (also called transcompiling) provides software engineers with the ability to port code without manually rewriting large amounts of code. In the past transcompiling has been done with rule-based systems but their output is often not easily usable. The rise of Transformers and BERT demonstrated new ways of translating from one language to another. Within this paper we attempt to improve code translation by fine-tuning CodeBERT with meaningful information extracted from Abstract Syntax Trees (ASTs). To that end, we propose two techniques (T5 and T5Unique) of extracting meaningful information from ASTs for improving code translation. We evaluate these methods against the CodeXGLUE baseline. The results are very similar to the baseline, with a slight improvement of 0.2\% in BLEU score for our newly proposed method, T5Unique.

## Requirements

With the `requirements.txt` file all python modules that are necessary to run the files
can be installed.
However, for tree sitter, two additional modules need to be downloaded for [C#](https://github.com/tree-sitter/tree-sitter-c-sharp)
and [java](https://github.com/tree-sitter/tree-sitter-java).

With the current parameters, at least a Tesla P100 GPU and 15GB of memory is recommended.

## Reproduce results

1. Create the vectors that will be concatenated to the original sequences by running
`prepare_data.sh`. The input data is found in `data/` (original source: [CodeXGLUE](https://github.com/microsoft/CodeXGLUE)) and its output is saved in `vectors/`.
2. Concatenate the vectors created in the previous step to the original sequence, resulting in the 
data that is used for training, by running `preprocess_data.sh`. The output is located at `preprocessed`.
3. Run `code/run.sh` with the correct data files as described in the file to start fine-tuning the model. 
4. Finally run `code/inference.sh` to perform the inference.

# Fine Tuned Models

The fine-tuned models can be downloaded over [here](https://tud365-my.sharepoint.com/:f:/g/personal/davanderende_tudelft_nl/EgxNZeRQeypKl6rPR2FNuYAB0SywCkA8CmngJup8S_k22g?e=Vvb0er) (TU Delft account required).


# Evaluate output

The pre-parsed output of our experiments can be found in `codeXGLUE/data/parsed`. Each separate experiment corresponding to each model and direction of translation can be found in these subdirectories. `cs-java` and `java-cs` contain the baseline results, `t5-cs-java` and `t5-java-cs` the identifier tagging model results, and `t5unique-cs-java` and `t5unique-java-cs` the unique identifier tagging results.

Each of the subdirectories contains a `.src`, `.gold` and `.output` file. These correspond to the source data, the correct translations and our model's output from the experiment respectively.

If you have conducted your own experiment, the output and gold files have to be parsed, for this we have written `result_data_parser.py`, which can also be found in `codeXGLUE`. You can call this on the `.gold` and `.output` files to parse them into a new file as follows:

`python result_data_parser.py [INFILE] > [OUTFILE]`

To evaluate parsed output, simply run `evaluator.py` that can be found in `codeXGLUE/evaluator/` as follows:

`python evaluator.py -ref [PATH-TO-GOLD] -pre [PATH-TO-OUTPUT]`

This should give an output similar to:

`BLEU: 78.62 ; Acc: 59.50`

## Results

Java to C#:

|     Method          |    BLEU    | Acc (100%) |   
|    ----------       | :--------: | :-------:  |
| CodeBERT   	      |   78.62    |   59.50    |
| CodeBERT + T5       |     78.37  |     57.70  |
| CodeBERT + T5Unique |     78.97  |     58.20  |

C# to Java:

|     Method          |    BLEU    | Acc (100%) |
|    ----------       | :--------: | :-------:  |
| CodeBERT            |   73.90    |    59.50   |
| CodeBERT + T5       |    73.57   |     58.00  |
| CodeBERT + T5Unique |    74.05   |     58.80  |
