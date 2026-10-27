package ma.ofppt

fun main() {
    val t1  = arrayOf(1,2,3,4,5,6)
    val t2  = Array(10){0}
    var st : Array<String> = Array(20){""}
    val intArr = IntArray(10){9}
    val doubleArr = DoubleArray(10){7.0}
    
    t1[1] = 5
    println(t1.joinToString(","))
    
    for(e in t1){
        println(e)
    }
    for(i in t1.indices){
        println(i)
    }
    
    for(i in 0..<t1.size){
        
    }
    println(t1.first())
    println(t1.sum())
    println(t1.average())
    println(t1.min())
    println()
}
