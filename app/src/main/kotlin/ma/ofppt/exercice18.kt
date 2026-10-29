package ma.ofppt

fun main() {
    val T = intArrayOf(1,2,3,4,1,2,5,2,7)
    print("donner un nombre : ")
    val v = readln().toInt()
    var p = -1
    for (i in T.indices){
        if(v==T[i]){
            p = i
            break
        }
    }
    println("$v se trouve à l'indice $p")
    p = T.find {it==v} ?: -1
    println("$v se trouve à l'indice $p")
}
