package ma.ofppt

fun main() {
    print("donner la note : ")
    var note = readln().toDouble()
    if (note <0 || note >20){
        print("note invalide")
    }else if(note<10){
        print("redoublant")
    }else if(note<12){
        print("passable")
    }else if(note<14){
        print("assez bien")
    }else if(note<16){
        print("bien")
    }else{
       print("trez bien") 
    }
    
    val mention = if (note <0 || note >20){
        "note invalide"
    }else if(note<10){
        "redoublant"
    }else if(note<12){
        "passable"
    }else if(note<14){
       "assez bien"
    }else if(note<16){
        "bien"
    }else{
      "trez bien"
    }
    
    
    val c = (1==1)? 2 : 3
    
}
