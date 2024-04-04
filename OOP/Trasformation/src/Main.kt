fun main() {
    val numbers = setOf(1,2,3,4,5,6,7)
    println(numbers.map{
        if (it == 5)
            it * 100
        else
            it * 10
    })

    val numberMapping = mapOf("key1" to 1,"key2" to 2,"key3" to 3,"key4" to 4)
    println(numbers.mapIndexedNotNull {
                                      index, value -> if (index == 0)
                                          null else value * index
    })

    println(numberMapping.mapKeys {
        it.key.uppercase()//transforms the keys to uppercase characters
    })

    println(numberMapping.mapValues {
        it.value + it.key.length //prints out the mapping and its length
    })
}