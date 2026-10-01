
n=1
while n<2:
    n = int(input("donner un nombre >=2 : "))
u1 = 1
u2 = 1
for i in range(2,n+1):
    un = u1+u2
    u1 = u2
    u2 = un
print(f"U{n} = {u1}")

u1 = 1
u2 = 1
for i in range(2,n+1):
    u2,u1 = u1+u2 , u2
print(f"U{n} = {u1}")