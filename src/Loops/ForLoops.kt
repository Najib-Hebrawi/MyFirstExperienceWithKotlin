/*
A for loop is another type of loop.
It makes looping through a list much easier.
It starts with the for keyword in Kotlin with the code block in curly braces.
The condition for executing the block of code is stated in parentheses.
 */
/*
In this example, the variable number is set equal to the first element of numberList and the code block is executed.
Then the number variable is automatically updated to be the next element of numberList,
 and the code block is executed again.
  This repeats for each element of the list,
  until the end of the numberList is reached.
 */

fun main(){

    val names = listOf("Jessica", "Henry", "Alicia", "Jose")


    // Add a for loop to print all items in the names list.
    for (name in names){
        println(name)

        //Modify the loop to also print out the number of characters in that person's name.
        // Hint: you can use the length property of a String to find the number of characters in that String.
        println("$name - Number of characters: ${name.length}")
    }




    var index=0
    var totalnames="  "
    while (index < names.size){
        totalnames += names[index] + " "
        index++
    }
    println(totalnames)

    // OR
    println(names.joinToString(" - "))







    //Note: Here are some other variations of what you can do with for loops,
    // including using them with ranges with specific steps (instead of incrementing by 1 each time).


    for (item in 'b'..'g'){
        print(item)
    } // Range of characters in an alphabet
    println()

    for (item in 1..5) {
        print(item)
    } // Range of numbers
    println()

    for (item in 5 downTo 1){
        print(item)
    } // Going backward
    println()

    for (item in 3..6 step 2){
        print(item)
    } // Prints: 35




}