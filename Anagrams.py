#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'makeAnagram' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. STRING a
#  2. STRING b
#

def makeAnagram(a, b):
    # Write your code here
    
    #i = 0
    charac = 0
    a_freq = {}
    b_freq = {}
    deletion = 0
    
    for i in a:
        
        if i in a_freq:
            a_freq[i] += 1
            
        else:
            a_freq[i] = 1
    
    for i in b:
        
        if i in b_freq:
            b_freq[i] += 1
            
        else:
            b_freq[i] = 1
    
    print (a_freq)
    print (b_freq)
        
    for j in a:
        if j in b_freq:
            if a_freq[j] > b_freq[j]:
                while a_freq[j] > b_freq[j]:
                    a_freq[j] -= 1
                    deletion += 1
            
            elif a_freq[j] < b_freq[j]:
                while a_freq[j] < b_freq[j]:
                    b_freq[j] -= 1
                    deletion += 1
                    
        else:
            a_freq.pop(j)
            deletion += 1
            
    for k in b:
        if k not in a_freq:
            b_freq.pop(k)
            deletion += 1
            
    return deletion

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    res = makeAnagram(a, b)

    fptr.write(str(res) + '\n')

    fptr.close()
