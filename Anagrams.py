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
    
    #print (a_freq)
    #print (b_freq)
    
#remove characters that are only in a or in both a and b but with higher frequency in a
    
    for j in a:
        if j in b:
            if a_freq[j] > b_freq[j]:
                a_freq[j] -= 1
                print('deleted', j)
                a = a.replace(j, '', 1)
                print(a)
                deletion += 1
                
        else:
            #print('deleted', j)
            a = a.replace(j, '', 1)
            #print(a)
            deletion += 1
            
    #print('Second Loop')
            
#remove characters that are only in b or in both a and b but with higher frequency in b
    
    for k in b:
        if k in a:
            if a_freq[k] < b_freq[k]:
                b_freq[k] -= 1
                print('deleted', k)
                b = b.replace(k, '', 1)
                print(b)
                deletion += 1
                
        else:
            print('deleted', k)
            b = b.replace(k, '', 1)
            print(b)
            deletion += 1
            
    #for key in a_freq:
    #    print(key, '->', a_freq[key])
    
    #for key in b_freq:
    #    print(key, '->', b_freq[key])
    
    return deletion

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    res = makeAnagram(a, b)

    fptr.write(str(res) + '\n')

    fptr.close()
