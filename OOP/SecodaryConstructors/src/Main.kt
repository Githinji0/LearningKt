fun main() {
    val user = User("william")
    val aFriend = User(
        "john",
        "stone"
    )
    println("name: ${user.name}")
    println("last name: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("name: ${aFriend.name}")
    println("last name: ${aFriend.lastName}")
    println("Age: ${aFriend.age}")


}

