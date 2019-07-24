import calendar
from datetime import date

color_list = ["Red", "Blue", "Yellow", "Black"]
print(color_list[0], color_list[3])

#Convert a String to an int
t = int(input("Input an integer: "))
i = int("%s" % t)
mult = i * 2
print(mult)
#only use the plus sign to combine strings

yr = int(input("\nPlease input a year: "))
mth = int(input("Please input a month: "))

print(calendar.month(yr, mth))

f_day = int(input("\nPlease type the start day: "))
l_day = int(input("Please type the end day: "))

firstDate = date(yr, mth, f_day)
secondDate = date(yr, mth, l_day)

diff = secondDate - firstDate
print(diff.days, "days")
#print(""" Al
#Contacto""")
