package ma.ofppt

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
    
    val nomJour = when(j){
        1 -> "Lundi"
        2 -> "Mardi"
        3 -> "Mercredi"
        4 -> "Jeudi"
        5 -> "Vendredi"
        6 -> "Samedi"
        7 -> "Dimanche"
        else -> "N° invalide"
    }
}
