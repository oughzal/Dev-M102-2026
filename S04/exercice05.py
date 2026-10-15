T = [15,80,7,36,70,8,45,2,7,0]
N = 10

X = int(input("donner X :"))
print(f"T : {T}")
for i in range(N):
    T[i] += X

print(f"T : {T}")