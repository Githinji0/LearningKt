fun main() {
    val alarm = 12

    when(alarm) {
        12, 7, 17 -> println("the time is $alarm")
        in 1 <= .. <= 10 -> println("the time is in reange 1 to 10")
        else-> println("the time is $alarm")
    }
}