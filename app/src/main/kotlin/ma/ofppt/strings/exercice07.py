def commenceParLettre(s:str)->bool:
    return s[0].isalpha()
def estAlphaNum(s:str)->bool:
    return s.isalnum()
def verifierIdentifant(s:str)->bool:
    return len(s)>=0 and commenceParLettre(s) and estAlphaNum(s)