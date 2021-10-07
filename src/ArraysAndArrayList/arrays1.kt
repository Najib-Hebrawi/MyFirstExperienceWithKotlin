package src1

fun main(){


    var elements=Array<Int>(5){0}

    for (index in 0..4){
        print("Enter Element : ")
        elements[index] = readLine()!!.toInt()
    }

    println("List of elements" )
    for (item in elements){
        println(item)
    }


}