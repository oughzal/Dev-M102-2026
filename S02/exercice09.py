n = int(input("donner un nombre : "))
s =0
for i in range(1, n+1):
    s += i**2 # s = s + i**2

print("la somme des carrés est :", s)

s=0
i = 1
while i <= n:
    s += i**2 # s = s + i**2
    i = i+1
print("la somme des carrés est :", s)