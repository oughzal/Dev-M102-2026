package ma.ofppt.strings

fun compterLettres(s:String):Int{
    var cmp =0
    for (c in s){
        if (c.isLetter()) cmp+=1
    }
    return cmp
    return s.count { it.isLetter() }
}
fun compterChiffre(s:String):Int {
    return s.count { it.isDigit() }
}
fun compterEspaces(s:String):Int{
    return s.count { it == ' ' }
}
fun compterMajuscules(s:String):Int{
    return s.count { it.isUpperCase() }
}
fun compterMinuscules(s:String):Int{
    return s.count { it in 'a'..'z' }
}
fun compterCaracteresSpeciaux(s:String):Int{
    return s.count { !it.isLetterOrDigit() }
}

fun main() {
    println(compterChiffre("DEV101"))
    println(compterEspaces("  D EV1 01a bc "))
    println(compterChiffre("DEV101"))
}

