def multiplication(a:int, b:int)->int :
    s=0
    for i in range(b):
        s += a
    return s
print(multiplication(7,6))