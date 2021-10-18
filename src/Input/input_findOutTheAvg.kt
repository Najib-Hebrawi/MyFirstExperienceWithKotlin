package Input

import java.util.*

fun main(){


    val input = Scanner(System.`in`)

    println("enter size of array")

    val size = input.nextInt()



    val salaries = DoubleArray(size)
    for (x in salaries.indices) {
        println("enter salary for employee number" + (x + 1))
        salaries[x] = input.nextDouble()
    }


    var sum = 0.0

    for (y in salaries.indices) {
        sum += salaries[y]
    }
    println(" the sum of salaries is $sum")
    println(" the average is " + sum / salaries.size)


}
