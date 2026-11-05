package ma.ofppt.strings

fun premierChars(s: String,n:Int):String{
    var result = ""
    for (i in 0..<n){
        result += s[i].toString()
    }
    return result
    return s.substring(0,n)
}

fun derniersChars(s:String,n:Int): String{
    return  s.substring(s.length-n,s.length)
}
fun caracteresPairs(s:String): String{
     var result = ""
    for (i in s.indices step  2){
        result += s[i].toString()
    }
    return result
}

fun supprimerCaractere(s:String,ch:Char):String{
    var result = ""
    for (c in s){
        if (c != ch) result += c.toString()
    }
    return  result
}

fun supprimerDoublant(s:String): String{
    var result = ""
    for (c in s){
        if (c !in result) result += c.toString()
    }
    return  result
}

fun main() {
    println(premierChars("DEV101",4))
    println(derniersChars("DEV101",4))
    println(caracteresPairs("DEV101"))
    println(supprimerCaractere("DE0DVE101",'0'))
    println(supprimerDoublant("DE0DVE101"))
}
