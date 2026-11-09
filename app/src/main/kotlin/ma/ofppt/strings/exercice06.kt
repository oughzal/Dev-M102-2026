package  ma.ofppt.strings

fun normaliserEspaces(s: String):String{
    return s.trim().replace(Regex("""\s+""")," ")
}
fun normaliserNom(nom:String): String{
    return normaliserEspaces(nom).lowercase()
        .replaceFirstChar { it.uppercase() }
}
fun supprimerPonctuation(s:String): String{
    return s.replace(Regex("""[\.,:;!?]"""),"")
}

fun estPlindrome(s:String): Boolean{
    return s == s.reversed()
}

fun main() {
    println(normaliserEspaces("   DEV    1   0   1      "))
    println(supprimerPonctuation("D,;?D:?E.V??"))
}