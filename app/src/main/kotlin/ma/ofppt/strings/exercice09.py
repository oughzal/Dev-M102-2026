def nettyerTel(tel : str)->str:
    return tel.replace(" ","").replace("-","").replace(".","")

def verifierTel(tel:str)->bool:
    t = nettyerTel(tel)
    if not t.isdigit():
        return False
    if len(t)!=10:
        return False
    if t[0]!="0" or t[1] not in "567":
        return False
    return True

def formaterTel(tel:str):
    result =""
    for i in range(len(tel)):
        if i%2!=0:
            result += tel[i]+ " "
        else:
            result += tel[i]
    return result
print(verifierTel("0678905600"))
print(verifierTel("0678905l00"))
print(verifierTel("4678905600"))
print(verifierTel("0478905600"))
print(verifierTel("0678905600"))
print(formaterTel("0678905600"))