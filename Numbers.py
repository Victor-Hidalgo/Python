i = int(input("Enter a number: "))
remainder = i % 2

if remainder > 0:
    print("This is an odd number.")
    
else:
    print("This is an even number.")

def isVowel(char):

    vowels = 'aeiou'
    return char in vowels

test = input("Please enter a character: ")

print(isVowel(test))

def gcd(a,b):

    result = 1

    if a % b == 0:
        return b

    for c in range(int(b/2), 0, -1):
        if a % c == 0 and b % c == 0:
            result = c
            break
    
    return result

print(gcd(12, 17))
print(gcd(4, 6))
