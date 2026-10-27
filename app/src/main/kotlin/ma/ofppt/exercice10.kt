package ma.ofppt

fun main() {
    print("donner le temps : ")
    var T = readln().toInt()
    val h = T / 3600 // h = t div 3600
    T %= 3600
    val m = T / 60
    val s = T % 60
    println("$h:$m:$s")
}
