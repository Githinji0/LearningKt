fun main() {
    //using an if else statements
    var a: String? = "william"
    a = null

    if (a != null){ //this will always be false, so we can safely skip this line
        println(a.length)
    }
    else{
        println(a)
    }
}