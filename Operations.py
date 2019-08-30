def addition(x, y):

    sum = x + y

    if sum in range(15, 20):
        return 20

    else:
        return sum

first = int (input("Enter first number: "))
second = int (input("Enter second number: "))

print(addition(first, second))

def exercise5(x, y):

    if x == y or abs(x - y) == 5 or (x + y) == 5:
        print("True")
        
    else:
        print("False")

#it is possible to replace the return statements with print statements
#however, the function must not be called with the print command

exercise5(first, second)
