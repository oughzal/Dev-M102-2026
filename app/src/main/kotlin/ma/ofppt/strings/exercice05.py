def compterLettres(s:str)->int :
    cmp = 0
    for c in s :
        if c.isalpha() :
            cmp +=1
    return cmp

def compterChiffres(s:str)->int:
    cmp = 0
    for c in s :
        if c >="0" and c<="9":
            cmp += 1

    return cmp
def compterEspaces(s:str)->int:
    cmp = 0
    for c in s :
        if c == " ":
            cmp += 1

    return cmp
def compterMajuscules(s:str)->int:
    cmp = 0
    for c in s:
        if 'A'<= c <= 'Z':
            cmp += 1
    return cmp
def compterMinuscules(s:str)->int:
    cmp = 0
    for c in s:
        if c.islower():
            cmp += 1
    return cmp

def compterCaracteresSpeciaux(s:str)->int:
    cmp = 0
    for c in s :
        if not c.isalnum():
            cmp += 1
    return cmp

print(compterLettres("DEV101@&bcd"))
print(compterMinuscules("DEV101@&bcd"))