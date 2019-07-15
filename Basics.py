import sys
import datetime
from math import pi

print("\nPython version:", sys.version)
print("\nVersion info.")
print(sys.version_info)

currentTime = datetime.datetime.now()
print("\nCurrent date and time:", currentTime.strftime("%Y-%m-%d %H:%M:%S"))

r = float(input ("\nPlease input the radius of the circle: "))
print("The area of the circle is " + str(pi * r**2))

#use input() to ask the user for Strings (without specifying the type)
firstName = input("\nPlease enter your first name: ")
lastName = input("Please enter your last name: ")
print("Good evening " + lastName + ", " + firstName)
