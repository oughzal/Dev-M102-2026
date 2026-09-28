j = int(input("donner le jour : "))
m = int(input("donner le mois : "))
a = int(input("donner l'année : "))

if j<1 or j>31 or m<1 or m>12 :
    print("date invalide")
elif j==31 and m in [2,4,6,9,11]:
    print("date invalide")
elif j==30 and m==2:
    print("date invalide")
elif j==29 and m==2 and not(a%400==0 or (a%4==0 and a%100!=0)):
    print("date invalide")
else :
    print("date valide")