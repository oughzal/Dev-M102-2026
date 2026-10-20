T1 = [1,2,3,4,5,6,7,8,9,10]
T2 = [1,2,3,4,5,6,7,8,9,10]

T3 =[0]*len(T1)
for i in range(len(T1)):
    T3[i] = T1[i] + T2[i]

print("T1 : ", T1)
print("T2 : ", T2)
print("T3 : ", T3)