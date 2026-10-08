def max2(a:float,b:float,c:float)->float:
    m = a 
    m = b if b>m else m
    m = c if c>m else m
    return m
def max3(a:float,b:float,c:float)->float:
    if a>=b and a>=c : 
        return a
    elif b>=a and b>=c :
        return b
    else :
        return c

def max4(a:float,b:float,c:float)->float:
    if a>=b :
        if a>=c :
            return a
        else:
            if c>=b:
                return c
            else :
                return b
    else:
        if b>=c:
            return b
        else:
            if a>=c:
                return a
            else:
                return c

print(max(8,2,9))
print(max2(8,2,9))
print(max3(8,2,9))
print(max4(8,2,9))
