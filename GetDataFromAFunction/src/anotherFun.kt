fun main() {
    val max = getMarks(5, 9)
    println(max)
}

fun getMarks(a: Int, b:Int): Int =  if (a > b) a else b


