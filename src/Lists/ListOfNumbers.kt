

fun main(){

    //List
   // val numbers:List<Int> = listOf(1,2,3,4,5,6) //
   //you can shorten this line of code to the following
    val numbers = listOf(1,2,3,4,5,6)

    println("List : $numbers.s ")

    // the code here to know the size of my list.
    println("Size: ${numbers.size}")



    // we can se the list have 6 elements, but they are 5 index, because the index starting from 0.
    println("First element: ${numbers[0]}")
    println("second element : ${numbers[1]}")


    //Print the last element of the list, using numbers.size - 1
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")


    //Kotlin also supports first() and last() operations on a list.
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")


    //contains()
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")


    println("this is the numbers but reversed :  ${numbers.reversed()}")










}