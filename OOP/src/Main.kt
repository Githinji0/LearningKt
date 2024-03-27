fun main() {
    val car1 = car() //instantiation..
    car1.name = "bima"
    car1.model = "s pal"
    car1.color = "red"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Doors = ${car1.doors}")
    println("Color = ${car1.color}")

    car1.move()//calling a function
    car1.stop()
    println("\n")

    val car2 = car()
    car2.name = "Tesla"
    car2.model = "plaid"
    car2.color = "pink"
    car2.doors = 5

    println("\n")
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Doors = ${car2.doors}")
    println("Color = ${car2.color}")
    car2.move()
    car2.stop()

}
//template
class car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0
    fun move() {
        println("car $name is moving")
    }
    fun stop(){
        println("car $name has stoped")
    }
}