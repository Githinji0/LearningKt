fun main() {
    sendMessage(name = "william", message = "heyy!!") //also (name: "william")
}

fun sendMessage(message: String = "user", name:String = "") {// default values
    println("name is $name and message is is $message")
}
fun sendText(): String{
    return "some text" //default value for the parameter
}