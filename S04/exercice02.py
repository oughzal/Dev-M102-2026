T = [0.0]*100
N = int(input("donner le nombre des notes : "))

for i in range(N):
    T[i] = float(input(f" donner le note {i+1} : "))
print(T)