package ma.ofppt

fun sommeDiviseurs(n:Int):Int{
    var s = 0
    for (i in 1..<n) {
        if (n%i==0) s+=i
    }
    return s
}
fun divSum(n:Int) = (1..<n).filter { n%it==0 }.sum()

fun main() {
    println(sommeDiviseurs(100))
    println(divSum(100))
}
