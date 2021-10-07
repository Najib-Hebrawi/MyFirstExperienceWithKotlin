fun main(){


    for (count in 1..10){

        print( " count : $count " )

        if (count==5){
            break
        }
    }

    println("end app")




    for (count1 in 1..10){

        print( " count1 : $count1 " )

        if (count1==5){
            continue
        }
    }

    println("end app")
}