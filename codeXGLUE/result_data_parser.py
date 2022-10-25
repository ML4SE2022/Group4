import os
import sys

# call like:
# python data_parser.py [FILENAME] > [PARSED FILE]

fn = sys.argv[1]

if os.path.exists(fn):
    # print (os.path.basename(fn))
    data = open(fn, 'r')
    lines = data.readlines()

    # count = 0
    # Strips the newline character
    for line in lines:
        # count += 1

        if line[0] == '<':
            end = line.find('</s>', 3)

            # parsedline = substring(line,)
            print(line.strip()[3:end])

        else:
            end = line.find("}0")

            print(line.strip()[0:end + 1])

        # if count > 10:
        #     exit()
    data.close()
