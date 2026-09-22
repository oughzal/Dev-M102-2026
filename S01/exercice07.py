# //entrée
# ecrire()
# lire(T)
T = int(input("donner le temps en secondes : "))
# //Traitement
H = T // 3600
T = T % 3600
M = T // 60
S = T % 60

# //Sortie
print(H,":",M,":",S)
print(f"{H}:{M}:{S}")