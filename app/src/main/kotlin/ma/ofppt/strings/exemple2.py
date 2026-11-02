nom = input("nom : ")
prenom = input("prénom : ")
annee = int(input("année : "))
login =prenom + "." + "nom" + str(annee)
login = f"{prenom}.{nom}{annee}"
print(f"login : {login}")