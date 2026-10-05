from random import randint

nb2 = randint(1,100)
n=1
nb1 = nb2 + 1 
while nb1 != nb2 and n<=5:
    nb1 = int(input("donner un nombre : "))
    if n>=5 :
        print("Game Over")
    elif nb1 == nb2 :
        print("vous avez trouver le bom nombre")
    elif nb1 > nb2 :
        print("trop grand")
    else:
         print("trop petit")

    n += 1