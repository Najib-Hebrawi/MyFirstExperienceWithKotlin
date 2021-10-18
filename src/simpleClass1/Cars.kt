package simpleClass1

class Car1(){

    // we use  null so the value can be null or not null
    var Type:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Owner:String?=null

    //To be sure that these parameters is working so i can use   init.
    constructor(Type:String, Model:Int,Price:Double,MilesDrive:Int,Owner:String) : this() {
        println("Type:$Type")
        this.Type=Type
        println("Model:$Model")
        this.Model=Model
        println("Price:$Price")
        this.Price=Price
        println("MileDrive:$MilesDrive")
        this.MilesDrive=MilesDrive
        println("Owner:$Owner")
        this.Owner=Owner
    }
    //here this method give the price, and  ?  to sure that can be Null. and Double means that the result should come back as Double
    fun GetPrice():Double{
        //  !! means the value of price can not be empty.
        // toDouble because the result should be Double, but MilesDrive is a Int , so i convert it to Double
        return this.Price!!- (this.MilesDrive!!.toDouble()*10)
    }
    fun GetOwner():String{
        return this.Owner!!
    }
}




fun main(args:Array<String>){

    // to make an instants from the car class in kotlin .
    var  car1=Car1("BMW",2015,2000.0,105,"Najib")
    println("Price is : " + car1.GetPrice())
    println("The Owner is : " + car1.GetOwner())

    println()

    var  car2=Car1("Kia",2020,10000.0,1001,"Tarek")
    println("Price is : " + car2.GetPrice())
    println("The Owner is : " + car2.GetOwner())





}


