T = [1,2,3,4,5,6]
print(T)
i = 0
j = len(T) -1
while i<j:
    T[i],T[j] = T[j],T[i]
    i+=1
    j-=1

print(T)

T = [1,2,3,4,5,6]
print(T)
T.reverse()
print(T)