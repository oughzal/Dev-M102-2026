package ma.ofppt

fun main() {
    print("donner le prix HT : ")
    val ht = readln().toDouble()
    print("donner la TVA (%) : ")
    val tva = readln().toDouble()
    
    val ttc = ht*(1 + tva/100)
    println("TTC : $ttc")
}
