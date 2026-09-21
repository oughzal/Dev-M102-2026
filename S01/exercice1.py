a = int(input("donner a :  "))
b = int(input("donner b :  "))

c = a
a = b
b = c

a,b = b,a


print(" a = ", a)
print(" b = ", b)