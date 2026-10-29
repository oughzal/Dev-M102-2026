package ma.ofppt

fun main() {
    val T = intArrayOf(1,-3,6,7,-9,-4)
    var Sn = 0
    var Sp = 0
    for(e in T){
        if(e>0) Sp += e
        else Sn += e
    }
    println("La somme des nombre positifs : $Sp")
    println("La somme des nombre négatis : $Sn")
    Sp = T.filter{it>0}.sum()
    Sn = T.filter{it<0}.sum()
    
    println("La somme des nombre positifs : $Sp")
    println("La somme des nombre négatis : $Sn")
    
}
