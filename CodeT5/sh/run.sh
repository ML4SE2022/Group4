#!/bin/bash

python run_exp.py --model_tag codebert --task translate --sub_task java-cs
python run_exp.py --model_tag codebert --task translate --sub_task cs-java

python run_exp.py --model_tag codebert --task translate --sub_task t5-java-cs
python run_exp.py --model_tag codebert --task translate --sub_task t5-cs-java

python run_exp.py --model_tag codebert --task translate --sub_task t5unique-java-cs
python run_exp.py --model_tag codebert --task translate --sub_task t5unique-cs-java