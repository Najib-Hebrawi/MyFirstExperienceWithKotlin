/*

    Operations rules | priorities rules
    1- ()
    2- ^
    3- * , /
    4- + , -
    5- =
 */
fun  main(args:Array<String>){

    val n1=10
    val n2=20
    val n3=5

    var sum:Int?=null

    sum=(n1+n2)*n3-3

    println(sum)

    println("sum=$sum")

    sum=(n1+n2)/n3
    println("sum=$sum")






}