note = float(input("donner la note : "))

if note<0 or note>20 :
    print("note invalide")
elif note<10:
    print("redoublant")
elif note<12:
    print("passable")
elif note<14:
    print("assez bien")
elif note<16:
    print("bien")
else :
    print("print")
print("fin de programme")