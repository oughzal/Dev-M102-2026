def inververMots(s:str)->str:
    mots = reversed(s.split())
    # mots.reverse()
    return " ".join(mots)

def echangerExtrimites(s:str)->str:
    mots = s.split()
    l = [mots[-1]] + mots[1:-1] + [mots[0]]
    return " ".join(l)
def inverserChaqueMots(s:str)->str:
    mots = s.split()
    l = []
    for mot in mots:
        l += [mot[::-1]]

    return " ".join(l)

def mettreMotsMaj(s:str)->str:
    return s.upper()
print(inververMots("dev 101 M102 les bases de l'algorithmiques"))
print(echangerExtrimites("dev 101 M102 les bases de l'algorithmiques"))
print(inverserChaqueMots("dev 101 M102 les bases de l'algorithmiques"))