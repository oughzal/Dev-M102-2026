n = int(input("donner un nombre : "))

f= 1
for i in range(1,n+1):
    f *= i # f = f * i
print(f"{n}! = {f}")

f=1
i=1
while i <=n:
    f = f*i
    i = i +1
print(f"{n}! = {f}")