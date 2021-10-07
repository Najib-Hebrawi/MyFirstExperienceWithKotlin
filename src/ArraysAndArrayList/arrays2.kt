package src1

fun main(){


    var elements=Array<String>(5){""}

    for (index in 0..4){
        print("Enter Element : ")
        elements[index] = readLine()!!.toString()
    }

    println("List of elements" )
    for (item in elements){
        println(item)
    }


}