data class User(var name:String)


//class User(var name:String)
fun main() {
    //var names = setOf<String>("name4","name2","name3","name4")//no repetation since a set contains unique items only
//    names.remove("name3")
//    var names = mutableSetOf<String>("name4","name2","name3","name4")
//    names.add("william")
    //names.forEach { println(it) }

    var user1 = User("Samuel")
    var user2 = User("John")
    var user3 = User("Mercy")
    var user4 = User("June")
    var user5 = User("June")

    var names = mutableSetOf<User>(user1,user2,user3,user4,user5)
    names.forEach { println(it.name) }
}
