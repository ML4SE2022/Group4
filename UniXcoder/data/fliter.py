import numpy as np
import json
import os
import pickle
import random

for language in ['go','java','javascript','php','python','ruby']:
    print(language)
    train,valid,test=[],[],[]
    for root, dirs, files in os.walk(language):
        for file in files:
            temp=os.path.join(root,file)
            if '.jsonl' in temp:
                if 'valid' in temp:
                    valid.append(temp)
                elif 'test' in temp:
                    test.append(temp)   
    url=set()
    for files,tag in [[valid,'valid'],[test,'test']]:
            for file in files:
                if '.gz' in file:
                    os.system("gzip -d {}".format(file))
                    file=file.replace('.gz','')
                with open(file) as f1:
                    for line in f1:
                        line=line.strip()
                        js=json.loads(line)
                        url.add(js['url'])
    data=pickle.load(open("{}_dedupe_definitions_v2.pkl".format(language),'rb'))
    print(len(data))
    test_data=[x  for x in data if x['url'] in url ]
    data=[x  for x in data if x['url'] not in url ]
    print(len(data))
    random.shuffle(data)
    pickle.dump(data[:-int(len(data)*0.01)],open("{}/train.pkl".format(language),'wb'))
    pickle.dump(data[-int(len(data)*0.01):],open("{}/dev.pkl".format(language),'wb'))
    pickle.dump(test_data,open("{}/test.pkl".format(language),'wb'))
                        

                    



        

