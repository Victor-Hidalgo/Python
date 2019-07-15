import sys
import datetime
from math import pi

print("\nPython version:", sys.version)
print("\nVersion info.")
print(sys.version_info)

currentTime = datetime.datetime.now()
print("\nCurrent date and time:", currentTime.strftime("%Y-%m-%d %H:%M:%S"))

r = float(input ("\nPlease input the radius of the circle: "))
print("\nThe area of the circle is " + str(pi * r**2))