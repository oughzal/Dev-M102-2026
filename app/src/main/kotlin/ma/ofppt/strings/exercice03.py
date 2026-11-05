def contienChar(s:str,ch:str)->bool :
    # return  ch in s 
    for c in s :
        if c.upper()==ch.upper(): return True
    return False
def premierePosition(s:str,ch:str)->int :
    for i in range(len(s)):
        if s[i].lower() == ch.lower():
            return i
    return -1
    return s.lower().find(ch.lower())

def dernierePosition(s:str,ch:str)->int:
    for i in range(len(s)-1,-1,-1):
        if s[i].lower() == ch.lower():
            return i
    return -1
    return s.lower().rfind(ch.lower())

def compterChar(s:str,ch:str)->int:
    c = 0
    for c in s:
        if c.lower() == ch.lower():
            c += 1
    return c
    return s.lower().count(ch.lower())

def remplacerChar(s:str,old:str,new :str)->str:
    result = ""
    for c in s:
        if c == old : 
            result += new
        else:
            result += c
    return result
    return s.replace(old,new)

print(contienChar("DEV101","e"))
print(contienChar("DEV101","X"))
print(remplacerChar("DEV101","1","2"))