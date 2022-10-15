from .parser.utils import (remove_comments_and_docstrings,
                   tree_to_token_index,
                   index_to_code_token,
                   tree_to_variable_index)
from tree_sitter import Language, Parser

# Load tree-sitter parser
parsers={}              
for lang in ['java','go','javascript','php','c','cpp','c_sharp']:
    LANGUAGE = Language('UniXcoder/parser/my-languages.so', lang)
    parser = Parser()
    parser.set_language(LANGUAGE) 
    parsers[lang] = parser

def travel(root_node,index_to_code,tokenizer=None):
    """Given a AST node, return AST travel sequence using Algo in the paper: https://arxiv.org/pdf/2203.03850.pdf"""
    if (len(root_node.children) == 0 or root_node.type == 'string' or root_node.type == 'comment' or 'comment' in root_node.type):
        index = (root_node.start_point,root_node.end_point)
        code = index_to_code[index][1]
        return code if tokenizer is None else tokenizer.tokenize(code)
    else:
        code_tokens = []
        for child in root_node.children:
            code_tokens += travel(child,index_to_code,tokenizer)
        # remove nodes that have only one children for reducing length
        if len(root_node.children) != 1:
            return ["AST#" + root_node.type.replace("#","") + "#Left"] + code_tokens + ["AST#" + root_node.type.replace("#","") + "#Right"] 
        else:
            return code_tokens

def AST(code,lang,tokenizer):
    """Given a code, return its AST flatten sequence"""
    if lang == "php":
        code = "<?php "+code+"?>" 
    # remove comment
    try:
        code = remove_comments_and_docstrings(code,lang)
    except:
        pass
    # parse source code
    if lang == "csharp":
        tree = parsers["c_sharp"].parse(bytes(code,'utf8'))    
    else:
        tree = parsers[lang].parse(bytes(code,'utf8'))  
    
    # obtain AST sequence
    root_node = tree.root_node  
    tokens_index = tree_to_token_index(root_node)     
    code = code.split('\n')
    code_tokens = [index_to_code_token(x,code) for x in tokens_index]  
    index_to_code = {}
    for idx,(index,code) in enumerate(zip(tokens_index,code_tokens)):
        index_to_code[index] = (idx,code)  

    code_tokens = travel(root_node,index_to_code,tokenizer)
    return code_tokens

def remove_comments(code,lang):
    """return comments and docstrings from a given code"""
    try:
        code = remove_comments_and_docstrings(code,lang)
    except:
        pass
    return code
                       
def preprocess(js,tokenizer,lang):
    """obtain different types of pre-training dataset"""
    js["function_tokens_tokenize"] = tokenizer.tokenize(" ".join(js["function_tokens"]))
    js["docstring_split_tokenize"] = tokenizer.tokenize(" ".join(js['docstring'].split()))
    js["docstring_tokenize"] = tokenizer.tokenize(js['docstring'])
    js["function_tokenize"] = tokenizer.tokenize(js['function'])
    js["function_without_doc_tokenize"] = tokenizer.tokenize(remove_comments(js['function'],lang))
    js["function_AST_tokenize"] = AST(js['function'],lang,tokenizer)
    return js
