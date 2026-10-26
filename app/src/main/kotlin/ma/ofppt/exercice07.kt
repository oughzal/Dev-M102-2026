package ma.ofppt

import kotlin.random.Random

fun main() {
    
    do {
       val n = Random.nextInt(1,7)
       println("face : $n") 
       print("voulez-vous relacer le dé? (y/n) : ")
       val rep = readln()
    }while (rep != "n")
 
}
