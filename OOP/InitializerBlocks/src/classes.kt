class Car( name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()
    fun move() {
        println("car $name is moving")
    }
    fun stop(){
        println("car $name has stoped")
    }
}