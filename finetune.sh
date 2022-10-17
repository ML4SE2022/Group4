python codeXGLUE/code/run.py \
	--do_train \
	--do_eval \
	--model_type roberta \
	--model_name_or_path microsoft/codebert-base \
	--config_name roberta-base \
	--tokenizer_name roberta-base \
	--train_filename ./preprocessed/train.t5.java,./preprocessed/train.t5.cs \
	--dev_filename ./preprocessed/valid.t5.java,./preprocessed/valid.t5.cs \
	--output_dir $output_dir \
	--max_source_length 512 \
	--max_target_length 512 \
	--beam_size 5 \
	--train_batch_size 16 \
	--eval_batch_size 16 \
	--learning_rate lr=5e-5 \
	--train_steps 100000 \
	--eval_steps 5000