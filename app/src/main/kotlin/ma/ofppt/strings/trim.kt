package ma.ofppt.strings

fun main() {
    val s = "      Kotlin       "
    
    println("|||${s}|||")
    println("|||${s.trim()}|||")
    println("|||${s.trimStart()}|||")
    println("|||${s.trimEnd()}|||")
}
