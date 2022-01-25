




class ThePlayersThatWillHitThePersonInTHeGame (subject: Subject,val name:String) : Observer() {


   init {
       this.subject = subject
       subject.attach(this)
   }

    fun thePersonThatWillHit(){
        subject.setState("AVVVV !")
    }


    override fun update() {
        println("$name heard Mohsen's AVVV! ")
    }

}