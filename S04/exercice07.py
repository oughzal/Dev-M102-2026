T = [-1,2,-8,-3,7,9,-5,8,-8,0]
N = 10
Sp = 0
Sn = 0
for i in range(N):
    if T[i]>0:
        Sp += T[i]
    else :
        Sn += T[i]

print("la somme des positifs est ",Sp)
print("la somme des négatifs est ",Sn)