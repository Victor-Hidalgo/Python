pi = 3.1415926536
r = float(input("Please input the radio: "))
volume = (4/3) * pi * r**3
print("The volume of the sphere is:", volume)

#the function returns a boolean
#functions MUST be declared and be above the lines where they are called.

def getLocation(n):
    return ((abs(1000 - n) <= 100) or (abs(2000 - n) <= 100))

print(getLocation(1000))
print(getLocation(900))
print(getLocation(2200))
print(getLocation(99))

a = 2
b = 4
c = 3

def getTripleSum(first, second, third):
    if first == second and second == third:
        sum = (first + second + third) * 3
    
    else:
        sum = first + second + third
    
    return sum

#print("Sum:", getTripleSum(a, b, c))

def isInString(str):
    
    if len(str) >=2 and str[:2] == "Is":
        return str
    
    else:
        return "Is" + str

print("\n")
print(isInString("Loop"))
print(isInString("IsEmpty"))
print(isInString("Not Empty"))
