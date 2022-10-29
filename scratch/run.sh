cd code
python3 run.py \
	--do_train \
	--do_eval \
	--model_type roberta \
	--model_name_or_path microsoft/codebert-base \
	--config_name roberta-base \
	--tokenizer_name roberta-base \
	--train_filename ../short-data/train.java-cs.txt.java,../short-data/train.java-cs.txt.cs \
        --dev_filename ../short-data/valid.java-cs.txt.java,../short-data/valid.java-cs.txt.cs \
	--output_dir output \
	--max_source_length 512 \
	--max_target_length 512 \
	--beam_size 5 \
	--train_batch_size 8 \
	--learning_rate 5e-5 \
	--train_steps 1000 \
	--eval_steps 500
