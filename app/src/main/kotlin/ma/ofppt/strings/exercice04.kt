package ma.ofppt.strings

fun estVoyelles(ch:Char)= ch in "oieauy"

fun compterVoyelles(s: String) = s.filter { estVoyelles(it) }.length

fun compterConsonnes(s: String) = s.filter { !estVoyelles(it) }.length

fun frequenceVoyelle(s: String,v: Char)= s.count { it.equals(v, ignoreCase = true) }

fun supprimerVoyelles(s:String): String =s.filter { !estVoyelles(it) }




