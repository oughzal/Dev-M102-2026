def compterOccurence(s:str,ch:str)->int:
    return s.lower().count(ch.lower())

def verifierEmail(email:str)->bool:
    email = email.lower()
    if email.count("@")!=1 :
        return False
    if email.startswith("@") or email.endswith("@") or email.endswith("."):
        return False
    if email.count("@.")!=0 or email.count(".@")!=0:
        return False
    if email.count(".") ==0 :
        return False
    pindex = email.rfind(".")
    aindex = email.find("@")
    if pindex < aindex :
        return False
    if email.split("@")[1].count(".")==0:
        return False
    if email.count(" ")>0 :
        return False
    if not email.replace("@","").replace(".","").isalnum():
        return False
    return True

print(verifierEmail("test@gmail.com"))
print(verifierEmail("test#@gmail.com"))
print(verifierEmail("te.st@gmailcom"))
print(verifierEmail("test.gmail.com"))
print(verifierEmail("test@gmail."))
print(verifierEmail("@testgmail.com"))
print(verifierEmail("testgmail.com@"))
print(verifierEmail("test@gmai@l.com"))