fun main() {
    val car = Car("voxy","red",2,1)
    val plane = Plane("boeing","red",1,4)
    car.name
    car.color
    car.move()
    car.stop()
    plane.move()
    plane.stop()
}
open class Vehicle(val name: String,val color: String) {
    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name is stopped")
    }
}

class  Plane(name: String,color: String,val doors: Int,  val engines: Int): Vehicle(name, color){}
class Car(name: String,color: String, val doors: Int, val engines: Int): Vehicle(name, color){}



