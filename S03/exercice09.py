def estPremier(n:int)->bool:
    if n==1 or n==2 :
        return True
    for i in range(2,n):
        if n%i==0 :
            return False
    return True

print(estPremier(5))
print(estPremier(7))
print(estPremier(4))