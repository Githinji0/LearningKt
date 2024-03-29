class Calculator() {
    companion object{
        fun max = 100
        fun sum(a: Int,b:Int): Int{
            return a + b
        }
    }


}
object DataBase{
    init {
        println("Database Created")
    }
}
class User (var firstName: String,var secondName:String,var age:Int){
    init {
        println("user: $firstName was created")
    }
}