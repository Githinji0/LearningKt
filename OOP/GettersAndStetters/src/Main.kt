fun main() {
    //they are implicit
    val user = User("william","jon")
    val aFriend = User(
        "john"

    )
    val user2 = User(age = 19, firstName = "julie", lastName = "dubbie")
    user.lastName = "Mikes"
    println("name: ${user.firstName}")
    println("last name: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("name: ${aFriend.firstName}")
    println("last name: ${aFriend.lastName}")
    println("Age: ${aFriend.age}")


}
class User(firstName: String, var lastName: String="lastName", var age:Int = 0) {
    var firstName = firstName
        //override the setter and getter
        get() {
            return "firstName: $field"
        }
        set(value) {
            println("$value is assigned")
            field = value
        }
}
