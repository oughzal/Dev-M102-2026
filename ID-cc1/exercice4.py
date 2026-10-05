
n = 1
i = 1
while n!=0 : # condition = True
    n = int(input("donner un nombre : "))
    if i==1 or m<n :
        m = n
        p = i
    i += 1

print(f"le max est {m} dans la position {p}")