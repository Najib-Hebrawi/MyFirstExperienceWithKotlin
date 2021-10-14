package Functions




fun main(){

    showNameFromTheUserInput()
}


fun showNameFromTheUserInput(){
    println("Enter your name ")
    val name:String= readLine()!!.toString()
    println("your name is : $name")
}