def changerExtrimites(s:str)->str :
    return s[-1] + s[1:-1] + s[0]
def inverserChaine(s:str)->str:
    return s[::-1]

def insererSeparateur(text:str,sep :str)->str:
    result =""
    for c in text:
        result += c + sep
    return result[:-1]
def repeterChars(text:str,n:int)->str:
    result =""
    for c in text:
        result += c*n
    return result

print(changerExtrimites("DEV101"))
print(inverserChaine("DEV101"))
print(insererSeparateur("DEV101","*"))
print(repeterChars("DEV101",3))