T = [15,80,7,36,70,8,45,2,7,0]
N = 10
m = T[0]
for i in range(N):
    if m <T[i]:
        m = T[i]

print(f"Le max est {m}")
print(f"Le max est {max(T)}")