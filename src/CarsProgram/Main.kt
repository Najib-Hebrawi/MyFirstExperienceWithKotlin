package CarsProgram

import java.util.*


/*
The idea is.That there are
10 users who must choose their wishes cars
from 4 options of cars then the
output shows what they have chosen in the end.
*/

fun main() {

    // here i giv the use a explain.
    val car = "Enter the car as you like from the list. OR enter Exit/E to go out of the system."
    println(car)
    // here a list of cars. and i use forloop to print the list.
    val cars = listOf<String>("BMW","AUDI","VW")
    for (index in cars) {
        print("$index ")
    }


    // here i make a counter so that start from zero.
    val BMW = 0
    val AUDI = 0
    val VW = 0
    val counter = mutableListOf<Int>(BMW, AUDI, VW)

    // here the program will be running until the user writ exit or e . and the program will count the input from the user.
    while (true) {
        val x = askUser(cars)
        if (x<0){
            if (x==-1) continue
            else break
        }
        counter[x]++
    }
    // here i use the forloop with the until methods to print the cars and the amount of cars that user input it
    for (i in  0 until counter.size){
        println("${cars[i]} ${"at all= "} ${counter[i]}")
    }


    // here i use the sum to show how many user dit writ there wishes
    println()
    println("Cars at all= " + counter.sum())
}




    // this function to get the input from the user.
    fun askUser(cars: List<String>):Int {
    val input: String = readLine()!!.toString().uppercase(Locale.getDefault())
    if (input == "BMW" && cars.contains("BMW")) {
        println("You have chosen BMW ")
        return 0
    } else if (input == "AUDI" && cars.contains("AUDI")) {
        println("You have chosen AUDI ")
        return 1
    }else if (input == "VW" && cars.contains("VW")) {
        println("You have chosen VW ")
        return 2
    }


    else if (input == "EXIT" || input.equals("E")) {
        println("You are out of the system, you can se here down what did you chosen in all. thanks for this time...")
        return -2
    }
    println("You have selected something that is not on the list. Tray again")
    return -1
}