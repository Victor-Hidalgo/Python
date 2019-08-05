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
