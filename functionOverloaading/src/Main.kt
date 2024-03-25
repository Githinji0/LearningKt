fun main() {
    val max = getMax(a = 7, b = 9, c = 10)
    println(max)
}
fun getMax(a: Int, b:Int) = if(a > b) a else b

fun getMax(a: Double, b:Double) = if(a > b) a else b

fun getMax(a: Int, b:Int, c:Int): Int {

    if(a >= b && a >= c) {
        return a
    }
    else if (b >= a && b >= c){
        return b
    }
    else{
        return c
    }
}