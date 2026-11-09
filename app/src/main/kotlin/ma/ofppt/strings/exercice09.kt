package ma.ofppt.strings

fun nettoyer(tel:String):String{
    return tel.replace(Regex("""[\s\.-]"""),"")
}

fun verifierTel(tel:String): Boolean{
    if (! tel.all{it.isDigit()}) return false
    if (tel.length !=10) return false
    if(!tel.startsWith('0') || tel[1] !in "567") return false
    return true
}

fun formaterTel(tel:String):String{
    var t = nettoyer(tel)
    var result =""
    for (i in t.indices){
        result += if (i%2 !=0) {
            "${t[i]} "
        }else{
            "${t[i]}"
        }
    }
    return result
}

fun main() {
    println(verifierTel("0678905600"))
    println(verifierTel("0678905l00"))
    println(verifierTel("4678905600"))
    println(verifierTel("0478905600"))
    println(verifierTel("0678905600"))
    println(formaterTel("0678905600"))
}
