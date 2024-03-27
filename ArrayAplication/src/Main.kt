

fun main() {
    var max = findMax(arrayOf(1,2,3,4,50,6,7,8))
    var min = findMin(arrayOf(2,2,5,6,7,8,9,0,90))
    println(max)
    println(min)
}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}
fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers){
        if (number < min){
            min = number
        }
    }
    return min
}