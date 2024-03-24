fun main() {

    sayHello(name = "william", version = 2)//invoking the function

    val internetConnect = true
    if (internetConnect) {
        getData(data = "some random data")
    }
    else{
        showText()
    }
}
fun sayHello(name: String, version: Int) {//parameters they are immutable
    println("hello $name from function $version")
}
fun getData(data: String) {
    println("your data is $data")
}
fun showText() {
    println("no internet connection")
}
