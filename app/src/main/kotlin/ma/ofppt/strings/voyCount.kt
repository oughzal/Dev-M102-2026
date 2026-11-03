package ma.ofppt.strings

fun voyCount(s:String):Int {
    var cmpt = 0
    val voy ="oieauy"
    for (c in s.lowercase()){
       if (c in voy) cmpt++ 
    }
    return cmpt
}
fun voyCount2(s: String) = s.lowercase().count { it in "oieauy" }
fun main() {
    println(voyCount("oiseau"))
    println(voyCount("DEVOAM"))
    println(voyCount2("oiseau"))
    println(voyCount2("DEVOAM"))
    
}
