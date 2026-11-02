package ma.ofppt.strings

fun main() {
    print("nom : ")
    val nom = readln()
    print("prenom : ")
    val prenom = readln()
    print("année : ")
    val annee = readln().toInt()
    
    val login = prenom + "." + "nom" + annee.toString()
    val login2 = "$prenom.$nom$annee"
}
