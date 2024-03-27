fun main() {
    //a simple function which calculates the total even numbers within a range
    var number =  1
    val lastNumber = 2000
    var evenCounter = 0

    while (number <= lastNumber){
        number++
        if (!isEven(number)){
            continue
        }
        evenCounter++
        println(number)
    }
    println("total = $evenCounter")

}
fun isEven(number: Int): Boolean{
    if((number % 2)==0){
        return true
    }
    else{
        return false
    }
}