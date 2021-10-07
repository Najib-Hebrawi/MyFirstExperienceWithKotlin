package OrderProgram_Resturant




/*
When it comes to ordering food at a local restaurant,
there's usually multiple items within a single order for a customer.
Using lists is ideal for storing information about an order.
You'll also draw on your knowledge of classes and inheritance to create a more robust and scalable Kotlin program,
instead of putting all the code within the main() function.
*/

/*
Here's a more detailed explanation of the code.
First there is a class called Item,
where the constructor takes in 2 parameters: a name for the item (as a String) and a price (as an integer).
Both properties do not change after they're passed in,
so they are marked as val. Since Item is a parent class, and subclasses extend from it,
the class is marked with the open keyword.
*/

/*
The Noodles class constructor takes in no parameters, b
ut extends from Item and calls the superclass constructor by passing in "Noodles" as the name and the price of 10.
The Vegetables class is similar but calls the superclass constructor with "Vegetables" and a price of 5.
*/


open class Item(val name: String, val price: Int)





class Noodles : Item("Noodles", 10){
    //Inside the Noodles class, override the toString() method and have it return the name.
    // Remember that Noodles inherits the name property from its parent class Item.
    override fun toString() : String {
        return name
    }
}





//In Kotlin, the vararg modifier allows you to pass a variable number of arguments of the same type into a function or constructor.
// In that way, you can supply the different vegetables as individual strings instead of a list.
//Note: Only one parameter can be marked as vararg and is usually the last parameter in the list.
//Update the toString() method to return Vegetables Chef's Choice if there are no toppings passed in.
// Make use of the isEmpty() method that you learned about earlier.
class Vegetables (vararg val toppings: String): Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}








//Methods: add item, add multiple items,
// print order summary (including price).
//This code so we can order an order.
class Order( val orderNumber : Int){
    private val itemList = mutableListOf<Item>()
    /*
    Go ahead and add the methods to the class definition too.
     Feel free to pick reasonable names for each method,
     and you can leave the implementation logic within each method blank for now.
     Also decide on what function arguments and return values should be required.
     */
    fun addItem(newItem: Item) {
        itemList.add(newItem)
    }

    fun addAll(newItems: List<Item>) {
        itemList.addAll(newItems)
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}















fun main() {
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    println(noodles)
    println(vegetables)



    val vegetables2 = Vegetables()
    println(vegetables2)
    println()



    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()




}