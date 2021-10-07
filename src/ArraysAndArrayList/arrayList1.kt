package ArraysAndArrayList
fun main(){




    var names = ArrayList<String>()
    names.add("Hussien")
    names.add("Tarek")
    names.add("Rami")


    for (items in names){
        println(items)
    }

    println()


    for (index in 0..names.size-1){
        print(names[index])
    }

    println()

    names.set(1,"Toto")

    println(names)



    println("search name : ")
    var search= readLine()!!.toString()
    if (names.contains(search)){
        println("name is found")
    }else{
        println("name not found")
    }


}