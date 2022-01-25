import java.util.*
import kotlin.collections.ArrayList


abstract class Subject {

    private var observers =ArrayList<Observer>()

    abstract fun setState (state:String)
    abstract fun getState (): String


    fun attach(observer: Observer){
        observers.add(observer)
    }

    fun detach(observer: Observer){
        observers.remove(observer)
    }



    fun notifyObservers(){
        observers.forEach{observer ->
            observer.update()
        }
    }


}