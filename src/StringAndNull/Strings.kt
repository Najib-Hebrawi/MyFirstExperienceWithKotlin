import java.util.*

fun main(args:Array<String>){


    var msg=" Welcome .to .NYC"
    println(msg)


    // To print the precise element in the string so
    println(" msg[5] " + msg[4] )

    println()

    //To print length of the string
    for (index in 0..msg.length - 1){
        println( " msg [$index] " + msg [index] )
    }


    var name:String= "Hussein"

    // here we can print to sentence together .
    var msgWelcome=name+ "," + msg
    println(msgWelcome)



    println(msgWelcome.lowercase(Locale.getDefault()))
    println(msgWelcome.uppercase(Locale.getDefault()))
    println(msgWelcome.trim())

    println(msgWelcome.split(" "))
    println(msgWelcome.split(","))
    println(msgWelcome.split("."))

}