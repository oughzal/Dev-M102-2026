T = [1,2,3,4,5,6,7,8,9,10] 
N = 10

V = int(input("donner un nombre : "))

p = -1
for i in range(len(T)): # len -> longueur de T
    if V==T[i]:
        p = i
        break

print(f"la position de {V} est {p}")

i = 0
j = len(T) -1
c = 0
while i<j and T[c]!= V :
    c = (i+j)//2
    if T[c]<V :
        i = c+1
    else :
        j = c -1

p = c if T[c]==V else -1
print(f"la position de {V} est {p}")
