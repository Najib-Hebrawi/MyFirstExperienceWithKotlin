package Loops

fun main(){

    println("Enter a number : ")
    var x = readLine()?.toInt()
    println("Enter number of power : ")
    var y = readLine()?.toInt()

    var result=1
    var i =0

    while (x !=null && y !=null && i < y){
        result *=x
        i++
    }

    println("$x to the power of $y is $result")


}