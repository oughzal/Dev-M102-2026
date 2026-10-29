package ma.ofppt

fun main() {
    val T = intArrayOf(1,2,3,4,1,2,5,2,7)
    print("donner une valeur : ")
    val v = readln().toInt()
    var c = 0
    for(e in T){
        if(e==v) c++
    }
    println("$v est répété $c fois dans le tableau")
    
    c = T.count { it == v }
    println("$v est répété $c fois dans le tableau")
}
