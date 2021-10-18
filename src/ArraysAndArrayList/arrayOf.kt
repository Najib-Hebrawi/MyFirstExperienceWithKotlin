package ArraysAndArrayList

fun main(){


    // here i use the whileloop or forloop, or jointostring to print myArray.


    val myArray = arrayOf("Hello","Guys","Whats up?")
    val arrayLength = myArray.size
    var i =0
    while (i < arrayLength){
        println(myArray[i])
        i++
    }
    println()





    for (x in myArray){
        println(x)
    }
    println()





    println(myArray.joinToString(" - "))

}