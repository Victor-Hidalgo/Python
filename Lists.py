a = [57, -12, 8]
print(a)

#add a value
a.append(1)
print(a)

a.append("Hello")
a.append([4, "Hi"])
print(a)

#delete an element
a.pop()
print(a)

#get a specific element
print(a[0])

b = [1,2,3]

for number in b:
	number*2

print(b)

factorial = 1

for i in range(1, 6):
	factorial = factorial*i

print("factorial of 5:", factorial)

total = 0
j=1

while j<=5:
	total += j
	j += 1
print("Sum:",total)

test_list = [10, 8, 5, 5, 2, -1, -3, -3, -6, -9]

i=0
negative_sum=0

while i<len(test_list):
	if test_list[i]<0:
		negative_sum += test_list[i]
	i += 1
	
print("Negative sum:", negative_sum)
