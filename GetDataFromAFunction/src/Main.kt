fun main() {
val max = getMarks(5, 9)
    println(max)
}
fun getMarks(a: Int, b:Int): Int {
    val max = if (a>b) a else b
    return max //stops the execution of th function
}