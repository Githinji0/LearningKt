fun main() {
    var number =0

    while (number < 10){
        println(number)
        number++
        var i = 0
        while (i <20){
            if (i ==0) {
                break
            }
            println("''$i")
            i++
        }
    }
}