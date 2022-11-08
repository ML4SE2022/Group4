cd code
python run.py \
    	--do_test \
	--model_type roberta \
	--model_name_or_path roberta-base \
	--config_name roberta-base \
	--tokenizer_name roberta-base  \
	--load_model_path output/checkpoint-best-bleu/pytorch_model.bin \
	--dev_filename ../data/valid.java-cs.txt.java,../data/valid.java-cs.txt.cs \
	--test_filename ../data/test.java-cs.txt.java,../data/test.java-cs.txt.cs \
	--output_dir output/inference/ \
	--max_source_length 512 \
	--max_target_length 512 \
	--beam_size 5 \
	--eval_batch_size 16
