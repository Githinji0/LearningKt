fun main() {
    //elvis operator (?:)
    //it's used to return the not null value even the conditional expression is null.

    var text: String? = null
    val text2: String = text ?: "some random text"
    text = "this variable is not nulll"
    println(text2)
}