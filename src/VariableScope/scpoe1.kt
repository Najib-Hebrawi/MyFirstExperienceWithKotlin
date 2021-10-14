package VariableScope





//when I write var name outside fun then it becomes public. and it becomes available for all functions in cenne class

    var name ="Najib Hebrawi"



    fun main(){
    println(name)
    show()
}



    fun show(){
    var age=30
    println(name)
    println(age)
}