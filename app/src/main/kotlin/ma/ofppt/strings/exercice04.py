import re
def estVoyelle(ch:str):
    return ch in "oieauy"

def compterVoyelles(s:str)->int:
    cmp = 0
    for c in s:
        if estVoyelle(c) : cmp+=1
    return cmp
    return len(filter(lambda c : estVoyelle(c)),s)

def compterConsonnes(s:str)->int:
    cmp = 0
    for c in s:
        if not estVoyelle(c) : cmp+=1
    return cmp
    return len(filter(lambda c : not estVoyelle(c)),s)

def frequenceVoyelle(s:str,v:str)->int:
    return s.count(v)

def supprimerVoyelles(s:str)->str:
    return re.sub(r"[oieauy]","",s)

print(supprimerVoyelles("aubceadyf"))
