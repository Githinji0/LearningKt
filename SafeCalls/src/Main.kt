fun main() {
    //we use the keyword '?.'

    val name: String? = "william"

    println(name?.length)

    //the let safe call operator

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}

