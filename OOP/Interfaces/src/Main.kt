fun main() {
    /*
    an interface is a collection of abstract methods and properties
    that define a common contract for classes that implement the interface
    */
    var truck = Truck("red","Hino")
    truck.startEngine()

}
interface Engine {
    fun startEngine()
}

class Truck(var color:String,var name:String): Engine{
    override fun startEngine() {
        println("The truck is starting..")
    }
}

class Plane(var color:String,var name:String): Engine{
    override fun startEngine() {
        println("The Plane is starting..")
    }
}

class Car(var color:String,var name:String): Engine{
    override fun startEngine() {
        println("The Car is starting..")
    }
}

class Tesla(var color:String,var name:String): Engine{
    override fun startEngine() {
        println("The Tesla is starting..")
    }
}
