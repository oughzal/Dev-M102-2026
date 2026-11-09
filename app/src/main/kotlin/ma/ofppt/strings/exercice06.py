import re
def normaliserEspaces(s:str)->str:
    return re.sub(r"\s+"," ",s) #row string

def normaliserNom(nom:str)->str:
    nom = normaliserEspaces(nom)
    return nom.capitalize()

def supprimerPonctuation(s:str)->str:
    # return s.replace(".","").replace(",","").replace(";","").replace(":","").replace("!","").replace("?","")
    return re.sub(r"[\.,:;!?]","",s)

def estPlindrome(s:str)->bool:
    s = re.sub(r"\s+","",s)
    return s == s[::-1]
    
            

print(normaliserEspaces("   DE    V  1  01       "))
print(supprimerPonctuation("dev, 101: algo;?python!"))
print(estPlindrome("l a val"))