package ma.ofppt

fun main() {
    val notes = Array(3){ DoubleArray (4){10.0}}
    
    for(i in notes.indices){
        for(j in notes[i].indices){
            print("${notes[i][j]}\t")
        }
        println()
    }
    
    for(i in notes.indices){
        println("somme de la ligne $i : ${notes[i].sum()}")
    }
    for(i in notes.indices){
        println("la moyenn du stagiaire ${i+1} : ${notes[i].average()}")
    }
    notes[2][3]= 16.0
    notes[0][3]= 6.0
    notes[1][3]= 6.0
    
    var max = notes[0].max()
    for(i in notes.indices){
        if(max < notes[i].max()) max = notes[i].max()
    }
    println("le max est $max")
    
    var c = 0
    for(i in notes.indices){
        for (j in notes[i].indices){
            if (notes[i][j]<10) c++
        }
    }
    println("le nombre des notes <10 : $c")
    
}
