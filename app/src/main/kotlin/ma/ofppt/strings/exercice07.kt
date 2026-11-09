package ma.ofppt.strings

fun commenceParLettre(s: String): Boolean{
    return s.first().isLetter()
}
fun estAlphaNum(s: String): Boolean{
    return s.all { it.isLetterOrDigit() }
}

fun verifierIdentifiant(s: String): Boolean{
    return s.length >= 6 && commenceParLettre(s) && estAlphaNum(s)
}

fun main() {
    println(verifierIdentifiant("1dev101"))
    println(verifierIdentifiant("dev101 "))
    println(verifierIdentifiant("dev10"))
    print(verifierIdentifiant("de@v10"))
}


