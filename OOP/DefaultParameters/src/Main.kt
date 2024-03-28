fun main() {
    val user = User("william")
    val aFriend = User(
        "john",
        "stone",
        29
    )
    val user2 = User(age = 19, firstName = "julie", lastName = "dubbie")
    println("name: ${user.firstName}")
    println("last name: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("name: ${aFriend.firstName}")
    println("last name: ${aFriend.lastName}")
    println("Age: ${aFriend.age}")


}


