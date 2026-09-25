a = float(input("a : "))
b = float(input("b : "))
c = float(input("c : "))

d = b**2 - 4*a*c

if d<0:
    print("pas de solution dans R")
elif d==0 :
    print(f"x={-b/(2*a)}")
else :
    print(f"x1 = {(-b + d**0.5)/(2*a)} ; x1 = {(-b + d**0.5)/(2*a)} ")