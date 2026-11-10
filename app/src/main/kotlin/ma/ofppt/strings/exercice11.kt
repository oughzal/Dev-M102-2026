package ma.ofppt.strings

fun inverserMots(s: String):String{
    val mots = s.split(Regex("""\s+"""))
    return mots.reversed().joinToString(" ")
}
fun echangerExtrimits(s:String):String{
    val mots = s.split(Regex("""\s+"""))
    val l = mutableListOf(mots.last())
    l.addAll(mots.slice(1..(mots.size-2)))
    l.add(mots.first())
    return l.joinToString(" ")
}
fun inverserchaqueMot(s: String):String{
    val mots = s.split(Regex("""\s+"""))
    return mots.joinToString("") { it.reversed() }
}

fun mettreMotsMaj(s:String):String{
    return s.uppercase()
}

fun main() {
    print(echangerExtrimits("dev 101 M102 les bases de l'algorithmiques"))
}
