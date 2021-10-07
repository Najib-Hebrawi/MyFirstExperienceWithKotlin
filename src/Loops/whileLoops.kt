

/*
To perform an operation on each item in a list, you can loop through the list (also known as iterating through the list).
Loops can be used with Lists and MutableLists.

While loops
One type of loop is a while loop. A while loop starts with the while keyword in Kotlin.
It contains a block of code (within curly braces) that gets executed over and over again,
as long as the expression in the parentheses is true.
To prevent the code from executing forever (called an infinite loop),
the code block must contain logic that changes the value of the expression,
so that eventually the expression will be false, and you stop executing the loop.
At that point, you exit the while loop, and continue with executing the code that comes after the loop.
*/

//Note: A while loop doesn't need to involve a list (example here) but it is useful for lists.


fun main(){

    /*

    Use a while loop to iterate through a list.
     Create a variable to keep track of what index you're currently looking at in the list.
     This index variable will keep incrementing by 1 each time until you reach the last index of the list,
      after which you exit the loop.
     */




    /*
    Let's say you are organizing a party.
    Create a list where each element represents the number of guests that RSVP'd from each family.
    First family said 2 people would come from their family.
    Second family said 4 of them would come, and so on.
     */
    val guestPerFamily= listOf(2 , 4 , 1 , 3)
                                                                                                     /*
                                                                                                    THE ALL CODE IS

                                                                                                    val guestsPerFamily = listOf(2, 4, 1, 3)
                                                                                                    var totalGuests = 0
                                                                                                    var index = 0
                                                                                                    while (index < guestsPerFamily.size) {
                                                                                                    totalGuests += guestsPerFamily[index]
                                                                                                    index++
                                                                                                    }
                                                                                                    println("Total Guest Count: $totalGuests")
                                                                                                    */



    /*
    Figure out how many total guests there will be.
    Write a loop to find the answer.
    Create a var for the total number of guests and initialize it to 0.
     */
    var totalGuests = 0



    /*
    Initialize a var for the index variable,
    as described earlier
     */
    var index = 0


    /*
    Write a while loop to iterate through the list.
     The condition is to keep executing the code block,
     as long as the index value is less than the size of the list.
     */
    while (index < guestPerFamily.size){
        totalGuests += guestPerFamily[index]
        // this same totalGuests = totalGuests + guestPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")




































}