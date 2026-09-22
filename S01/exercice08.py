# ecrire()
# lire(H) 
H = int(input("donner H : "))   
M = int(input("donner M : "))   
S = int(input("donner S : "))   
D = int(input("donner D : "))   


# // Traitement
S = S + D
M = M + S // 60
S = S % 60

H = H + M // 60
M = M % 60

# //Sortie
print(H,":",M,":",S)