# // entréé
PU = float(input("donner PU : ")) 
qt = int(input("Donner la quantité : "))
# // Traitement
TVA = 0.2
TTC = PU*qt*(1+TVA)
# //Sortie
print("TTC : ",TTC)