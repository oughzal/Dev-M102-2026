package ma.ofppt

fun main() {
    print("donner a : ")
    val a = readln().toDouble()
    print("donner b : ")
    val b = readln().toDouble()
    print("donner l'opération (+,-,*,/) : ")
    val op = readln()
    
    when(op){
        "+" -> print("$a + $b = ${a+b}")
        "-" -> print("$a - $b = ${a*b}")
        "*" -> print("$a * $b = ${a*b}")
        "/" ->{
            if(b != 0.0){
                print("$a / $b = ${a/b}") 
            }else{
                print("impossible de diviser par zéro")
            }
           
        } 
        else -> print("opération invalide")
    }
    
}
