pi = 3.1415926536
r = float(input("Please input the radio: "))
volume = (4/3) * pi * r**3
print("The volume of the sphere is:", volume)

def getLocation(n):
    return ((abs(1000 - n) <= 100) or (abs(2000 - n) <= 100))

#the function returns a boolean
print(getLocation(1000))
print(getLocation(900))
print(getLocation(2200))
print(getLocation(99))
