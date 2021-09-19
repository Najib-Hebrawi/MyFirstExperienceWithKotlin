


fun main(){

    println("Enter number")
    var number:Int= readLine()!!.toInt()

    try {
        if ( number>=1 && number <=100  ){
            //block of code

            println(" Number between 1 -  to 100 ")

        }else{
            println("Number is not in the range")
        }
    } catch (e: Exception) {
        println(e.message)
    }

    println("End app")


    


}