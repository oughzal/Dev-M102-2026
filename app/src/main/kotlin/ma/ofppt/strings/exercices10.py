def premierMot(s:str)->str:
    mots = s.split()
    return mots[0]
def dernierMot(s:str)->str:
    mots = s.split()
    return mots[-1]

def compterMots(s:str)->int:
    mots = s.split()
    return len(mots)

def motPlusLong(s:str)->str:
    mots = s.split()
    mlong = mots[0]
    for mot in mots:
        if len(mot)> len(mlong):
            mlong = mot
    return mlong
def motPlusCourt(s:str)->str:
    mots = s.split()
    mCourt = mots[0]
    for mot in mots:
        if len(mot)< len(mCourt):
            mCourt = mot
    return mCourt


print(premierMot("dev 101 M102 les bases de l'algorithmiques"))
print(dernierMot("dev 101 M102 les bases de l'algorithmiques"))
print(compterMots("dev 101 M102 les bases de l'algorithmiques"))
print(motPlusLong("dev 101 M102 les bases de l'algorithmiques"))
print(motPlusCourt("dev 101 M102 les bases de l'algorithmiques"))
print("dev 101 M102 les  bases de  l'algorithmiques".split())