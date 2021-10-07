fun main( ) {




    //here i have an array, with 5 elements and all elements are 0 .
    var arrayInt=Array<Int>(5){0}
    arrayInt[2]=40
    for (index in 0..4){
        print(arrayInt[index])
    }

    println()

    for (items in arrayInt){
        print(items)
    }

    println()

    for (items in arrayInt){
        print(items)
    }

    println()


    for (indexx in 0..4){
        print("Enter Element : ")
        arrayInt[indexx] = readLine()!!.toInt()
    }

println("List of elements" )
    for (item in arrayInt){
        print(item)
    }

}