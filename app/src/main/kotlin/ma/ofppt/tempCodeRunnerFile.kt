
fun main() {
    print("donner le N° du jour : ")
    val j = readln().toInt()
    
    when(j){
        1 -> print("Lundi")
        2 -> print("Mardi")
        3 -> print("Mercredi")
        4 -> print("Jeudi")
        5 -> print("Vendredi")
        6 -> print("Samedi")
        7 -> print("Dimanche")
        else -> print("N° invalide")
    }
}