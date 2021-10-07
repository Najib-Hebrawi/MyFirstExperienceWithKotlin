

fun main(){



    val colors:List<String> = listOf("green","orange","blue")
    //Or like this code here down , so here kotlin will find out if it is a String List.
    //val colors = listOf("green","orange","blue")


    // this code will have a problem because we cannot add or change elements in this List
    //colors.add("purple")
    //3colors[0] = "yellow"


    // this code giv the list in the reversed mod
    println("Reversed list : ${colors.reversed()}")
    println("List: $colors")


    //The output is a new list of colors sorted in alphabetical order. Cool!
    println("sorted list:  ${colors.sorted()}")

    //You can also try the sorted() function on a list of unsorted numbers.
    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")

    // add number to oddNumbers
    println("the new list is : ${oddNumbers.plus(9)}")








}