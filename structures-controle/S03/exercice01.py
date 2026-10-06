def Adulte(age : int)->str :
    if age >= 18 :
        return "Adulte"
    else:
        return "Mineur"
    return "Adulte" if age>=18 else "Mineur"

print(Adulte(15))
print(Adulte(25))