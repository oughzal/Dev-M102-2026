a = float(input("donner nb1 : "))
b = float(input("donner nb2 : "))
op = input("donner l'opération (+,-,*,/) : ")

if op=="+" : 
    print(f"{a}+{b}={a+b}")
elif op=="-" : print(f"{a}-{b}={a-b}")
elif op=="-" : print(f"{a}*{b}={a*b}")
elif op=="/" : 
    if b != 0 :
        print(f"{a}/{b}={a/b}")
    else:
        print("impossible de diviser par zéro")
else :
    print("opération invalide")

match op:
    case "+" :print(f"{a}+{b}={a+b}")
    case "-" :print(f"{a}+{b}={a+b}")
    case "*" :print(f"{a}+{b}={a+b}")
    case "/" :
        if b != 0 :
            print(f"{a}/{b}={a/b}")
        else:
            print("impossible de diviser par zéro")
    case _ : print("opération invalide")