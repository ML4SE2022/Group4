from transformers import RobertaTokenizer
import math
import sys

tokenizer = RobertaTokenizer.from_pretrained("roberta-base")

def main():
    if len(sys.argv) != 4:
        print("use: code_file, vec_file, output_file")
        sys.exit()
    
    code_file = sys.argv[1]
    vec_file = sys.argv[2]
    output_file = sys.argv[3]
    
    with open(code_file, 'r') as infile:
        code_lines = infile.read().split('\n')
        
    with open(vec_file, 'r') as infile:
        vec_lines = infile.read().split('\n')
        
    assert len(code_lines) == len(vec_lines)
    
    n_lines = len(code_lines)
    output = ""
    
    for i in range(n_lines):
        print("progress: "+str(math.floor(i/n_lines*100))+"%", end='\r')
        if len(code_lines[i])<1:
            continue
            
        vec_line = " ".join(vec_lines[i][1:-1].split(','))
        code_line = code_lines[i]
        #tokenized_new_line = tokenizer.encode(code_line, vec_line, add_special_tokens=True)
        new_line = code_line + tokenizer.sep_token + vec_line #tokenizer.decode(tokenized_new_line)
                
        output += new_line + '\n'
            
    print()
    with open(output_file, 'w') as outfile:
        outfile.write(output)
     
    ''' 
    with open(output_file) as infile:
        for line in infile.read().split('\n'):
            assert len(tokenizer(line)['input_ids']) <= 512
    '''
    
if __name__ == "__main__":
    main()
