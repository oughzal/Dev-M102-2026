import math
from math import sqrt
# //entrée
Xa = float(input("Xa : "))
Ya = float(input("Ya : "))
Xb = float(input("Xb : "))
Yb = float(input("Yb : "))

# //Traitement
D = math.sqrt((Xa-Xb)**2 + (Ya -Yb)**2)
D = sqrt((Xa-Xb)^2 + (Ya -Yb)^2)
D = ((Xa-Xb)**2 + (Ya -Yb)**2)**0.5

# //Sortie
print("D = ",D)