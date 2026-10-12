def estBissextile(a:int)->bool:
    return a%400==0 or (a%4==0 and a%100!=0)

def dateValide(j:int,m:int,a:int)->bool:
    if j<1 or j>31 or m<1 or m>12 :
        return False
    elif j==31 and m in [2,4,6,9,11]:
        return False
    elif j==30 and m==2 :
        return False
    elif j==29 and m==2 and not estBissextile(a):
        return False
    else:
        return True

print(estBissextile(2026))
print(estBissextile(2028))
print(estBissextile(1900))
print(estBissextile(1600))
print("date valide")
print(dateValide(12,10,2026))
print(dateValide(31,11,2026))
print(dateValide(30,2,2026))
print(dateValide(29,2,2026))
print(dateValide(29,2,2028))