def addition(x, y):

    sum = x + y

    if sum in range(15, 20):
        return 20

    else:
        return sum

first = int (input("Enter first number: "))
second = int (input("Enter second number: "))

print(addition(first, second))