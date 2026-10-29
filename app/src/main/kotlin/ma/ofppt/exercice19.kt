package ma.ofppt

fun estBissexile(a:Int): Boolean{
    return a%400==0 || (a%4==0 && a%100!=0)
}

fun isLeap(a:Int)= a%400==0 || (a%4==0 && a%100!=0)

fun dateValide(j:Int,m:Int,a:Int): Boolean{
    if(j<1 || j>31 || m<1 || m>12) return false
    else if (j==31 && intArrayOf(2,4,6,9,11).contains(m)) return false
    else if (j==30 && m==2) return false
    else if (j==29 && m==2 && !estBissexile(a)) return false
    else return true
}
fun isDateValid(j:Int,m:Int,a:Int)= if(j !in 1..31 || m !in 1..12)  false
    else if (j==31 && intArrayOf(2,4,6,9,11).contains(m))  false
    else if (j==30 && m==2)  false
    else if (j==20 && m==2 && !estBissexile(a))  false
    else  true

fun main() {
    println(estBissexile(2026))
    println(estBissexile(2028))
    println(dateValide(29,10,2026))
    println(dateValide(31,11,2026))
    println(dateValide(29,2,2026))
}
