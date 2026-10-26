package ma.ofppt

fun main() {
    print("donner un nombre : ")
    val n = readln().toInt()
    
    var i = 2
    while (n % i !=0){
        i++
    }
    if(i==n){
        println("$n est premier")
    }else{
        println("$n n'est pas premier")
    }
    }
