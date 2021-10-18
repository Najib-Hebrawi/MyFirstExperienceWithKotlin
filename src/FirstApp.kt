fun main(args:Array<String>){



    println("welcome to kotlin")
    print("Hi "  + "\nNajib")
    println()


    var name = ""
    println("Enter your name:")
    while (name.isEmpty()) {
        print("Enter a valid name...")
       name = readLine()!!.toString()

    }



    val input= readLine()
    println(input?.toUpperCase())

}