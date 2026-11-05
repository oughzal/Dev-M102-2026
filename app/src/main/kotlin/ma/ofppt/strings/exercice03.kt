package ma.ofppt.strings

fun contientChar(s: String,ch:Char): Boolean{
    for (c in s){
        if (c.equals(ch, ignoreCase = true)){
            return  true
        }
    }
    return false
    return ch in s
}

fun premierePosition(s:String,ch:Char):Int{
    for (i in s.indices){
        if (s[i].equals(ch, ignoreCase = true)){
            return i
        }
    }
    return -1
    return s.indexOf(ch)
}

fun dernierePosition(s:String,ch:Char):Int{
    for (i in (s.length -1) downTo -1){
        if (s[i].equals(ch, ignoreCase = true)) return i
    }
    return -1
    return s.indexOfLast{it.equals(ch, ignoreCase = true)}
}

fun compterChar(s: String,ch:Char):Int{
    var cmp = 0
    for (c in s){
        if(c.equals(ch, ignoreCase = true)) cmp++
    }
    return cmp
    return s.count{it.equals(ch, ignoreCase = true)}
}

fun remplacerChar(s:String,old:Char,new:Char):String{
    var result =""
    for (c in s){
        if (c.equals(old, ignoreCase = true)){
            result += new.toString()
        } else{
            result += c.toString()
        }
    }
    return  result
}
fun main() {
    println(premierePosition("DEV101",'A'))
}