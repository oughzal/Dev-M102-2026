package ma.ofppt.strings

fun normaliser(nom: String, prenom:String):String{
    var result = nom.uppercase()
    result += " " + prenom.lowercase().replaceFirstChar { it.uppercase()} 
    return result
}

fun main() {
    print("donner le nom : ")
    val nom = readln()
     print("donner le prénom : ")
    val prenom = readln()
    
    println(normaliser(nom,prenom))
       
}
