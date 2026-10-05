n = int(input("donner n : "))
d = int(input("donner d : "))

gcd = n if n<d else d
gcd = min(n,d)
if n<d :
    gcd = n
else:
    gcd = d

while n%gcd!=0 and d%gcd!=0:
    gcd -=1
print(f"{n}/{d} = {n//gcd}/{d//gcd}")