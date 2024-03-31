fun main() {
    println("Hello World!")
}
open class Vehicle(var name: String,var color: String){

    class  Car(name: String,color: String, val doors: Int){
        fun move(){
            println("$name is mivng")
        }
        fun  stop(){
            println("$name is stoped")
        }
    }
    class  plane(name: String,color: String, val engines: Int): Vehicle(name, color){
        fun move(){
            println("$name is mivng")
        }
        fun  stop(){
            println("$name is stoped")
        }
    }

}



