# Group4
Finetune CodeBERT with AST

We used two methods to fine tune the codeBERT + decoder model from codeXGLUE.
The first is the same way as used for codeT5, which adds a binary identifier label
to the input.
The second method is our own extend implementation of the above, and gives each identifier
a unique number instead of a binary label. This method is called T5Unique.

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
3. Finally, run `CodeT5/sh/run.sh` to start fine-tuning the model. This step runs the script as 
provided by CodeT5 with our own data.

## Results

Java to C#:

|     Method          |    BLEU    | Acc (100%) |  [CodeBLEU](https://github.com/microsoft/CodeXGLUE/blob/main/Code-Code/code-to-code-trans/CodeBLEU.MD) |  
|    ----------       | :--------: | :-------:  | :-------: |
| Naive copy          |   18.54    |    0.0     |      -    |
| PBSMT      	      |   43.53    |   12.5     |   42.71   |
| Transformer         |   55.84    |   33.0     |   63.74   |
| Roborta (code)      |   77.46    |   56.1     |   83.07   |
| CodeBERT   	      | **79.92**  | **59.0**   | **85.10** |
| CodeBERT + T5       |     0.0    |     0.0    |     -     |
| CodeBERT + T5Unique |     0.0    |     0.0    |      -    |

C# to Java:

|     Method          |    BLEU    | Acc (100%) |  [CodeBLEU](https://github.com/microsoft/CodeXGLUE/blob/main/Code-Code/code-to-code-trans/CodeBLEU.MD) | 
|    ----------       | :--------: | :-------:  | :-------: |
| Naive copy          |   18.69    |     0.0    |      -    |
| PBSMT               |   40.06    |    16.1    |   43.48   |
| Transformer         |   50.47    |    37.9    |   61.59   |
| Roborta (code)      |   71.99    |    57.9    | **80.18** |
| CodeBERT            | **72.14**  |  **58.0**  |   79.41   |
| CodeBERT + T5       |    0.0     |     0.4    |      -    |
| CodeBERT + T5Unique |    0.0     |     1.4    |      -    |