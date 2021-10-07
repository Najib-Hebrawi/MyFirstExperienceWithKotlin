import java.util.*


fun main(){


    //input

    println("Enter your year od birth :  ")
    var yearOfBirth:Int = readLine()!!.toInt()

    println("Enter your month number :  ")
    var monthOfBirth:Int = readLine()!!.toInt()




    //process

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var month=Calendar.getInstance().get(Calendar.MONTH)


    var ageyear=year- yearOfBirth
   var agemonth=month-monthOfBirth





    //output

    print("your age are " +  ageyear  + agemonth )

}