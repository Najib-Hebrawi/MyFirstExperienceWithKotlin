package OrderProgram_Resturant






open class Student(val name : String, val age :Int)

class Software : Student("Najib", 30){
    override fun toString(): String {
        return name
    }
}
class Data :Student("Tarek", 25){
    override fun toString(): String {
        return name
    }
}

fun main(){


    val software =Software()
    val data=Data()
    println(software)
    println(data)






}