fun main() {
//    var names = listOf<String>("william","name2","name3","name4") this is immutable
    var names = mutableListOf<String>("william","name2","name3","name4")
    names.add("name4")
    names.removeAt(0)
    names.remove("name4")
//    println(names[0])
    names.forEach { println(it) }
}