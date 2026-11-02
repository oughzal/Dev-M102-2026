def checkLogin(login:str)->bool:
    if len(login)<6 : return False
    if not login.isalnum() : return False
    if not login[0].isalpha() : return False
    return True

print(checkLogin("dev101"))
print(checkLogin("de101"))
print(checkLogin("dev@101"))
print(checkLogin("2dev@101"))