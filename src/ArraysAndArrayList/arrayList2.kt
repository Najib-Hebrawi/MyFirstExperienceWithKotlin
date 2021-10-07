package ArraysAndArrayList

fun main(){


    var names=ArrayList<String>()
    names.add("Najib")
    names.add("Tarek")
    names.add("Rami")



    println("Enter a name to search : ")

    var search = readLine()!!.toString()
    if (names.contains(search)){
        println("The name is found")
    }else {
        println("The name is not found")
    }

}