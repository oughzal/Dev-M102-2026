package ma.ofppt.strings

fun compterOccurence(s:String,c:Char):Int{
    return s.lowercase().count { it ==c.lowercaseChar() }
}

fun verifierEmail(email:String): Boolean{
    if (email.count { it=='@' } !=1) return false
    if (email.startsWith("@") || email.endsWith("@") || email.startsWith(".") || email.endsWith(".")) return false
    if (email.contains("@.") || email.contains(".@")) return false
    if(!email.split("@")[1].contains('.')) return false
    if(!email.replace(Regex("""[@\.]"""),"").all{it.isLetterOrDigit()})return false
    
    return true
}

fun main() {
    println(verifierEmail("test@gmail.com"))
    println(verifierEmail("test#@gmail.com"))
    println(verifierEmail("te.st@gmailcom"))
    println(verifierEmail("test.gmail.com"))
    println(verifierEmail("test@gmail."))
    println(verifierEmail("@testgmail.com"))
    println(verifierEmail("testgmail.com@"))
    println(verifierEmail("test@gmai@l.com"))
}
