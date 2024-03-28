fun main() {
    val user = user("william", "kotlin",20)
    val  aFriend = user("john","stone", 17)
    println("name: ${aFriend.name}")
}
class user(name: String, var lastName:String, var age:Int){
    var name: String

    init {
        if (name.toLowerCase().startsWith("a")){
            this.name = name
        }
        else{
            this.name = "User"
            println("the name doesnt start with 'a'")
        }
    }
}
