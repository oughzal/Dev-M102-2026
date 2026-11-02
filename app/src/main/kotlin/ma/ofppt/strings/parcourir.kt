package ma.ofppt.strings

fun main() {
    val s = "Kotlin"
    
    for (c in s ){
        print("$c \t")
    }
    
    for (i in s.indices){
        print("${s[i]} \t")
    }
}
