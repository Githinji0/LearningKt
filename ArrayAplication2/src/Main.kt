import kotlin.math.min

fun main() {
    var max = findMaxAndMin(arrayOf(10,20,73,54,505,65,7,8),true)
    var min = findMaxAndMin(arrayOf(2111,21,52,63,74,84,59,690,90),false)
    println("The max value is: $max")
    println("the min value is: $min")
}

fun findMaxAndMin(numbers: Array<Int>, searchMaxIn: Boolean):Int {
    var max = numbers[0]
    var min = max
    if (searchMaxIn){
        for (number in numbers){
            if (number > max){
                max = number
            }
        }
        return max
    }
    else{
        for (number in numbers){
            if (number < min)
                min = number
        }
        return min
    }
}