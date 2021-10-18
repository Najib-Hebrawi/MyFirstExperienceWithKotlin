package Overriding



// this is a superclass and it is open to can be inhiretenc
open class Operations{

    // i write it as open to know that is can be a supermethod
   open fun sum(n1: Double, nr2: Double): Double {
        return n1 + nr2
    }

}


class MulOperations(): Operations() {
    //here it is overrided by the oprations
   override fun sum(n1: Double, nr2: Double): Double {
        // i use this to reached the method
        this.sum(10.0,10.0)

        // i use super so can reached the method in the superclass
        super.sum(10.0,10.0)

        return n1 + nr2 +15
    }
}



fun main(args:Array<String>){

    // here a instance from operations class
    var op=Operations()
    println(op.sum(10.0,10.0))

    // here a instance from muloperations class
    var mulop= MulOperations()
    println(mulop.sum(10.0,10.0))

}

