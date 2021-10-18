package diceGame

fun main(){
    rolle()

}


fun rolle(){

    val dicerange:IntRange=1..6
    val rol=dicerange.random()
    println(rol)


}