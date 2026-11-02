def normaliserNom(nom : str,prenom : str)->str :
    resultat =  nom.upper()
    resultat += " " + prenom.capitalize() 
    return resultat

nom = input("donner le nom : ")
prenom = input("donner le prénom : ")
print(normaliserNom(nom,prenom))
