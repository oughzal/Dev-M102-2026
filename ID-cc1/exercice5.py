n = int(input("donner un nombre : "))
s = 0
for i in range(1,n+1):
    if i%2 ==0 :
        s += i
        print(i)
print(f"la somme est {s}")