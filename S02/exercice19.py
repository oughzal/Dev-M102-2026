n = int(input("donner un nombre : "))

inv = 0

while n != 0 :
    inv = inv*10 + n%10 
    n //= 10 # n = n // 10

print(f"la somme est {inv}")