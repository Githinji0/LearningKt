fun main() {
    val car = Car("voxy","red",2,1)
    val plane = Plane("boeing","red",1,4)
    println(car.name)
    println(car.color)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}
open class Vehicle(val name: String,val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name is stopped")
    }
}

class  Plane(name: String,color: String,val doors: Int,  val engines: Int): Vehicle(name, color){
    override fun move() {//to call something from amin class
        //println("The plane is flying")
        flying()
        super.move()
    }
    fun flying(){
        println("the plane is flying!")
    }
}
class Car(name: String,color: String, val doors: Int, val engines: Int): Vehicle(name, color){}

