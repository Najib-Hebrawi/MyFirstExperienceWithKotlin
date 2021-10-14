package CarsProgram

import java.util.*


/*
The idea is.That there are
10 users who must choose their wishes cars
from 4 options of cars then the
output shows what they have chosen in the end.
*/

fun main() {

    val car = "Enter the car as you like from the list. OR enter Exit/E to go out of the system."
    println(car)

    val BMW = 0
    val AUDI = 0
    val VW = 0

    val counter = mutableListOf<Int>(BMW, AUDI, VW)
    val cars = listOf<String>("BMW","AUDI","VW")
    for (index in cars) {
        print("$index ")
    }
    while (true) {
        val x = askUser(cars)
        if (x<0){
            if (x==-1) continue
            else break
        }
        counter[x]++
    }
    for (i in  0 until counter.size){
        println()
        println("${cars[i]} ${"at all= "} ${counter[i]}")
    }
    println()
    println("Cars at all= " + counter.sum())
}
fun askUser(cars: List<String>):Int {
    val input: String = readLine()!!.toString().uppercase(Locale.getDefault())
    if (input == "BMW" && cars.contains("BMW")) {
        println("You have chosen BMW ")
        return 0
    } else if (input == "VW" && cars.contains("VW")) {
        println("You have chosen VW ")
        return 2
    } else if (input == "AUDI" && cars.contains("AUDI")) {
        println("You have chosen AUDI ")
        return 1
    } else if (input == "EXIT" || input.equals("E")) {
        println("You are out of the system, you can se here down what did you chosen in all. thanks for this time...")
        return -2
    }
    println("You have selected something that is not on the list. Tray again")
    return -1
}