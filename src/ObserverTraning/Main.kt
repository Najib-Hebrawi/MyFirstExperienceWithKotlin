package ObserverTraning

import ThePersonThatHaveBeingHitet
import ThePlayersThatWillHitThePersonInTHeGame




    fun main () {
        val mohsen = ThePersonThatHaveBeingHitet()


        val mostafa = ThePlayersThatWillHitThePersonInTHeGame(mohsen, "Mostafa")
        val mohamed = ThePlayersThatWillHitThePersonInTHeGame(mohsen, "Mohamed")
        val bodi = ThePlayersThatWillHitThePersonInTHeGame(mohsen, "bodi")


        mostafa.thePersonThatWillHit()

        Thread.sleep(2000)

        println("Tow Seconds Passed")

        bodi.thePersonThatWillHit()

    }

