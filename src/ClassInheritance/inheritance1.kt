package ClassInheritance



// here i should make the class as open so i can inheritance from it (superclass)
open class Operations {
    fun sum(n1: Double, nr2: Double): Double {
        return n1 + nr2
    }
   fun sub(n1: Double, nr2: Double): Double {
        return n1 - nr2
    }
}

// here the subclass from the superclass operations
class MulOperations():Operations() {

    fun div(n1: Double, nr2: Double): Double {
        return n1 / nr2
    }
    fun mul(n1: Double, nr2: Double): Double {
        return n1 * nr2
    }
}




    fun main(args:Array<String>){

        // here a instance from operations class
        var op=Operations()
        println(op.sum(10.0,12.0))
        println(op.sub(10.0,12.0))

        // here a instance from muloperations class
        var mulop=MulOperations()
        println(mulop.sum(10.0,12.0))
        println(mulop.sub(10.0,12.0))
        println(mulop.div(10.0,12.0))
        println(mulop.mul(10.0,12.0))


    }
