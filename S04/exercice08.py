T = [1,3,5,1,3,8,7,1,5,10]
N = 10
nb = int(input("donner un nombre : "))
c = 0
for i in range(N):
    if T[i]==nb :
        c += 1
print(nb, " est répété ",c , " fois")
print(nb, " est répété ",T.count(nb) , " fois")