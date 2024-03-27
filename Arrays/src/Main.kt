fun main() {
    val name = arrayOf("william","kink","john")
    val numbers = arrayOf(1, 2,3,4, "name",'C')
    name[1] = "sam" //changing arrays
    println(name[0])

    println("the size is ${name.size}")//getting the size
    //looping thro an array
    for (number in numbers){
        if (number is Int){ //only return integers
            println(number)
        }

    }
}