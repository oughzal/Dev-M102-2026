package ma.ofppt

fun main() {
    print("donner un nombre : ")
    val n = readln().toInt()
    var f = 1
    for(i in 1..n){
       f*= i 
    } 
    
    println("$n! = $f")
}
