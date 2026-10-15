T = [10.5,15,18.0,17.6,5,9,20,2,14,19]
N= 10

s = sum(T)/N
s = sum(T)/len(T)

print("la moyenne des notes est",s)
for i in range(N):
    if T[i]>s :
        print(T[i])