package VisibilityModifiers




open class superclass{


    // try ti writ protecte/privete
    var name="Najib"


    fun printname(){
        println(name)
    }
}





class subclass():superclass(){
    fun printname1(){
        println(name)
    }
}




fun main(){

    var name=superclass()
    name.printname()

    var name1=subclass()
    name1.printname1()
}
