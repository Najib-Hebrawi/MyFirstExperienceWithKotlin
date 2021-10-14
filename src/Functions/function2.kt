package Functions

fun main(){

var sumResult = sum(10.5,10.5)
    println(sumResult)
 sumResult = sum(1111.5,11.5)
    println(sumResult)
 sumResult = sum(1023.5,105.5)
    println(sumResult)


}



//here i use a fun to do a sum for my. and type Double is the retrieves value
fun sum(number1:Double,number2:Double): Double{
    val sumVal =number1+number2
    // return the sum
    return sumVal

}