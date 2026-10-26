package ma.ofppt

import kotlin.math.sqrt
import kotlin.random.Random

fun greeting(nom:String, age:Int){
    println("nom : $nom \n age : $age")
}
fun racine(x:Double) : Double{
    return sqrt(x)
}
fun carre(n:Int = 5) = n*n

fun carre(x : Double):Double{
    return x*x
}
fun etoiles(n:Int){
    for (i in 1..n){
        print("*")
    }
}
fun main() {
    println(carre(9))
    println(carre())
    greeting("nom",22)
    greeting(nom="nom",age=22)
    greeting(age=22, nom ="nom2")
    println(Random.nextInt(1,100))
}
