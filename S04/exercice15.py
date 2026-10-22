M = [[0]*4]*5

for i in range(5):
    for j in range(4):
        M[i][j]= float(input(f"donner la note de l'étudiant {i+1} dans la matière {j+1}  : "))

    moy = 0
    mc = 0

    for i in range(5):
        moy =0
        for j in range(4):
            moy += M[i][j]
        moy /= 4
        mc +=moy
        print("la moyenne de l'étudiant",i+1," est ",moy)
    mc /=5
    print(f"la moyenne de la classe est {mc}")                                            