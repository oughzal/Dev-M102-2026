package ma.ofppt.strings

fun premierMot(s:String):String{
    val mots = s.split(Regex("""\s+"""))
    return mots.first()
}
fun dernierMot(s:String):String{
    val mots = s.split(Regex("""\s+"""))
    return mots.last()
}

fun compterMots(s:String):Int{
    val mots = s.split(Regex("""\s+"""))
    return mots.size
}

fun motPlusLong(s: String):String{
    val mots = s.split(Regex("""\s+"""))
    var mlong = mots.first()
    for (mot in mots){
        if (mot.length > mlong.length) mlong = mot
    }
    return mlong
    return mots.maxBy { it.length }
}
fun motPlusCourt(s:String):String{
    return s.split(Regex("""\s+""")).minBy { it.length }
}

fun main() {

}
