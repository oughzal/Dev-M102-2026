n = int(input("donner un nombre : "))

s = 0

while n != 0 :
    s += n%10 # s = s + n%10
    n //= 10 # n = n // 10

print(f"la somme est {s}")