package ArraysAndArrayList

fun main (){
    val myarray= arrayOf(2,5,7,2,8,66)
    var sum =0
    for (items in myarray){
        sum = sum +items
    }
    println("The sim of the array is $sum")
}