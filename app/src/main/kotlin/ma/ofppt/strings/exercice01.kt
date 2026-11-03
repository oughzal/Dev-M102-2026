package ma.ofppt.strings

fun echangerExtrimites(s: String):String{
    return s[s.length - 1] + s.substring(1,s.length -1) + s[0]
}
fun inverserChaine(s: String) = s.reversed()
fun inverserChaine2(s: String) : String {
    return s.reversed()
    }

fun insererSeperateur(s:String , sep:Char):String{
    var result = ""
    for (c in s){
        result += "$c$sep"
        
    }
    return result.substring(0,result.length -1)
}

fun repeatChars(s:String,n:Int):String{
    var result = ""
    for (c in s){
        result += c.toString().repeat(n)
    }
    return  result
}
fun main() {
    println(echangerExtrimites("DEV101"))
    println(inverserChaine("DEV101"))
    println(insererSeperateur("DEV101",'*'))
    println(repeatChars("DEV101",3))
}
