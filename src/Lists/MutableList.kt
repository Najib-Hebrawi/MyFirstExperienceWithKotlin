


fun main(){


    //  create an empty mutable list and assign it to a val variable called entrees.
    val entrees= mutableListOf<String>()

    //Another way you could have fixed the error is by specifying the data type of the variable upfront.
    // val  entrees: MutableList<String> = mutableListOf()


    //Note: You can use val for a mutable list because the entrees variable contains a reference to the list,
    // and that reference doesn't change even if the contents of the list do.


    println(entrees.isEmpty())
    println("Entrees:  $entrees")


    // this code do add elements to the list
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")

    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("entrees: $entrees")





    /* note: Instead of adding elements one by one using add(),
    you can add multiple elements at a time using addAll() and pass in a list.

     Here we use "val" because wi will not change any elements in the featur */
    val moreItems= listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")





    //Call remove() to remove "spaghetti" from the list. Print the list again.
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")


    //What happens if you try to remove an item that doesn't exist in the list?
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")


    //You can also specify the index of the element to remove. Use removeAt() to remove the item at index 0.
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")




    //If you want to clear the whole list, you can call clear().
    entrees.clear()
    println("Entrees: $entrees")


    //The isEmpty() method is useful if you want to do an operation on a list or access a certain element,
    // but you want to make sure that the list is not empty first.
    println(entrees.isEmpty())




}