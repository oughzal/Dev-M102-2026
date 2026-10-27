package ma.ofppt

fun main() {
    val notes = intArrayOf(12, 15, 8, 17, 10, 14, 6, 19)
    
    for(e in notes){
        println(e)
    }
    println("nomre des éléments : ${notes.size}")
    println("la somme est ${notes.sum()}")
    println("la moyenne est ${notes.average()}")
    println("la notes maximale est ${notes.max()}")
    
    var c = 0
    for (e in notes){
        if(e>=10) c++
    }
    println("nombre des notes >=10 : $c")
    println("nombre des notes >=10 : ${notes.count { it>=10 }}")
    notes[2] = 13
    
    println("T[${notes.joinToString(",")}]")
    print("le nom est \"Ali\"")
}
