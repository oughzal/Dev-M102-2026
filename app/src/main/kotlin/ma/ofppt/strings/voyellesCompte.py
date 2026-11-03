def voyCount(s:str)->int :
    cmpt = 0
    voy = "oieauy"
    for c in s.lower() : 
        if c in voy :
            cmpt += 1
    return cmpt

print(voyCount("oiseau"))
print(voyCount("DEVOAM"))