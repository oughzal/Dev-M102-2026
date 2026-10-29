package ma.ofppt

fun estPremier(n:Int): Boolean {
    if (n==1 || n==2) return true
    for(i in 2..<n){
        if (n%i==0) return false
    }
    return true

}

fun main() {
    println(estPremier(5))
    println(estPremier(6))
}
