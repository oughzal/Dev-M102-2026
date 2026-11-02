package ma.ofppt.strings

fun main() {
    println("${"Kotlin".uppercase().contains("ko".uppercase())}")
    println("${"Ko" in "Kotlin"}")
    println("${"Kotlin".find{it=='l'}}")
    println("${"Kotlin".indexOf("li")}")
    
}
