fun main() {
    // used to declare a parameter that accepts a variable number of arguments of the same type
    println(sum(5,6, 7, 8,2,2,8,2,3,9))
}

fun sum(vararg numbers: Int): Int{
    var result = 0
    for (number in numbers) {
        result += number

    }
    return  result
}
