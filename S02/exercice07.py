a = int(input("donner l'année : "))

if a%400==0 or (a%4==0 and a%100!=0):
    print("Année bissextile")
else :
    print("Année non bissextile")