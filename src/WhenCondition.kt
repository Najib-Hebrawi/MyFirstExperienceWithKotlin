


fun main() {


    println("Enter a number")
    val number:Int = readLine()!!.toInt()

    when(number){

        1-> {
            println(" you enter one")
        }
        2-> {
            println("you enter 2")
        }

        3,4 -> {
            println("enter number between 1 and 4")
        }
        in 10..30 -> {
            println("number between 10 to 30")
        }
        !in 10..30 ->{
            println("number not betoween 10 and 30")
        }
        else-> {
            println("out of the range")
        }

    }


}
