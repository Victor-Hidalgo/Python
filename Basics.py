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

numbers = input("\nPlease enter comma separated numbers: ")

#List: Container which holds comma separated values between square brackets (can hold mix data types).
list = numbers.split(",")

#Tuple: Similar to a list but immutable (you cannot change its content once created)
tuple = tuple(list)

print("\nList: ", list)
print("Tuple: ", tuple)
