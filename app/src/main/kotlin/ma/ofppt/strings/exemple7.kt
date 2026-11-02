package ma.ofppt.strings

fun checkLogin(login : String): Boolean{
    if (login.length <6 ) return false
    if (!login[0].isLetter()) return false
    if(login.any { !it.isLetterOrDigit() })return false
    return true
}
fun main() {
    println(checkLogin("dev101"))
    println(checkLogin("de101"))
    println(checkLogin("dev@101"))
    println(checkLogin("2dev@101"))
}
