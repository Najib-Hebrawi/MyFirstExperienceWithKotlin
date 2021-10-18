package Loops

fun main(){


    // this code to print the heist number in the loop
    val numers= arrayOf(2,4,6,8,2,100)
    var max=numers[0]
    for (item in numers){
        if (item > max){
            max=item
        }
    }
    println(max)
}