T = [1,2,1,4,5,20,4,7,7,9,1] 

for i in range(len(T)):
    c = 0
    for j in range(len(T)):
        if i!=j and T[i]==T[j]:
            c += 1
    if c==0:
        print(T[i],end="\t")

   