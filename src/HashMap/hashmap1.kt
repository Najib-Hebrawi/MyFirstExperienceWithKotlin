package HashMap

fun main(){

    var map=HashMap<Int,String>()

    map.put(1,"Hussnain")
    map.put(12,"Rami")
    map.put(40,"Tarek")
    map.put(70,"Ahmad")

    println(map[1])
    println(map[12])
    println(map[3])

    map.set(12,"Najib")


    for (index in map){
        println(index)
    }

    println()


    for (Key in map.keys){
        println(map[Key])
    }





}