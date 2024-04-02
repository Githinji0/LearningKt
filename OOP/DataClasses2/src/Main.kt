fun main() {
    //The data class in Kotlin is used to hold the data
    //This data class contains some utility functions that are often derivable from the data
    var user1 = User("william","doe", 20)
    var user2 = User("william","doe", 20)


    println(user2 == user1)
    println(user2)
    println(user1)
}
//easier method of comparing
data class User(var firstName:String, var lastName:String,var age:Int)

