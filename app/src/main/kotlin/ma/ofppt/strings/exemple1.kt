package ma.ofppt.strings

fun main() {
    print("donner le nom : ")
    val nom = readln()
    println("nom : $nom")
    println("longueur : ${nom.length}")
    println("premier caractère : ${nom[0]}")
    println("premier caractère : ${nom.first()}")
    println("dernier caractère : ${nom.last()}")
    println("dernier caractère : ${nom[nom.length -1]}")
}
