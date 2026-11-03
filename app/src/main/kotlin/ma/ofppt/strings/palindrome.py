def estPalindrom(s:str)->bool :
    s = s.replace(" ","")
    i = 0
    j = len(s) -1
    
    while i<j and s[i]==s[j]:
        i += 1
        j -= 1
    return s[i]==s[j]

def estPalindrom2(s:str)->bool :
    s = s.replace(" ","")
    return s == s[::-1]

print(estPalindrom("L      AV AL"))
print(estPalindrom("DEV"))
print(estPalindrom2("LAVAL"))
print(estPalindrom2("DEV"))


