package ma.ofppt

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("donner a : ")
    val a = readln().toDouble()
    print("donner b : ")
    val b = readln().toDouble()
    print("donner c : ")
    val c = readln().toDouble()
    
    val d = b.pow(2) -4*a*c
    
    if(d<0) println("aucune solution dans R")
    else if (d==0.0) println("x = ${-b/(2*a)}")
    else {
        val x1 = (-b + sqrt(d)/(2*a))
        val x2 = (-b - sqrt(d)/(2*a))
        println("x1 = $x1 ; x2 = $x2")
    }
    
}
