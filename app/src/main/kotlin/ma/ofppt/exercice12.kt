package ma.ofppt

fun main() {
    print("donner nb1 : ")
    val nb1 = readln().toDouble()
    print("donner nb2 : ")
    val nb2 = readln().toDouble()    
    print("donner l'opération (+,-,*,/) : ")
    val op = readln()
    
    when(op){
        "+" -> println("$nb1 + $nb2 = ${nb1 + nb2}")
        "-" -> println("$nb1 - $nb2 = ${nb1 - nb2}")
        "*" -> println("$nb1 * $nb2 = ${nb1 * nb2}")
        "/" -> if (nb2 != 0.0) println("$nb1 / $nb2 = ${nb1 / nb2}")
        else println("impossible de diviser par zéro")
    }
}
