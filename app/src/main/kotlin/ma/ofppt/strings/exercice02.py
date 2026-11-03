def premiersChars(s:str,n:int)->str:
    result = ""
    for i in range(n):
        result += s[i]
    return result
    return s[0:n]
def derniersChars(s:str,n:int)->str:
    result = ""
    for i in range(len(s)-n ,len(s)):
        result += s[i]
    return result
    return s[-n:]

def caracterePair(s:str)->str:
    result = ""
    for i in range(0,len(s),2):
        result += s[i]
    return result
    return s[::2]
def supprimerChar(s:str, ch : str)->str:
    result = ""
    for c in s:
        if c != ch :
            result += c
    return result
    return s.replace(ch,"")

def supprimerDoublant(s:str)->str:
    result =""
    for c in s :
        if c not in result:
            result += c
    return result

print(premiersChars("DEV101",3))
print(derniersChars("DEV101",3))
print(caracterePair("DEV101"))
print(supprimerChar("DEV101","1"))
print(supprimerDoublant("DEV101DVAB"))