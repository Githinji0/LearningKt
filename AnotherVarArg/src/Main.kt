fun main() {
    // used to declare a parameter that accepts a variable number of arguments of the same type
    sum(1,2,3,4,5,6,7,8,8,9,0,7,8,8)
}
//for each loop
fun sum(vararg numbers: Int){
    numbers.forEach {print(it) }
}
