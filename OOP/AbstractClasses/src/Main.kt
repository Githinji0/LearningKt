fun main() {
//    val car = Car("voxy","red",2,1)

}
abstract class Vehicle {
//    val text = "This is a text"
    abstract fun move()

    abstract fun stop()
}

class Car(val name: String,val color: String, val doors: Int, val engines: Int): Vehicle(){
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}



