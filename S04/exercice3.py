T = [0]*100
N = int(input("donner le nombre des élément du tableau :"))
for i in range(N):
    T[i] = int(input(f"donner T[{i}]"))

s=0
p=1
for i in range(N):
    s += T[i]
    p *= T[i]
m= s/N
print(f"La somme est {s}")
print(f"Le produit est {p}")
print(f"La moyenne est {m}")