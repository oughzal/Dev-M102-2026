package ma.ofppt

fun main() {
    print("Donner n : ")
    val n = readln().toInt()
    var s = 0
    for(i in 0..n){
        if(i%2==0) { s+= i}
    }
    println("La somme est $s")
}
