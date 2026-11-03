package ma.ofppt.strings

fun estPalindrome(s: String): Boolean{
    val s = s.replace(" ","")
    var i = 0
    var j = s.length -1
    while (i<j && s[i]==s[j]) {
        i++
        j--
    }
    return s[i]==s[j]
}
fun estPalindrome2(s: String): Boolean {
    val s = s.replace(" ","")
    return s == s.reversed()
}

fun main() {
    println(estPalindrome("L      AV AL"))
    println(estPalindrome("DEV"))
    println(estPalindrome2("LAVAL"))
    println(estPalindrome2("DEV"))
}
