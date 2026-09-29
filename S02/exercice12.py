n = int(input("donner un nombre : "))

i = 2
while i<n and n%i!=0 :
    i+=1
if i==n :
    print(f"{n} est premier")
else :
    print(f"{n} n'est pas premier")

premier = True
for i in range(2,n+1):
    if n%i==0:
        premier = False 
        break
if premier==True :
    print(f"{n} est premier")
else :
    print(f"{n} n'est pas premier")