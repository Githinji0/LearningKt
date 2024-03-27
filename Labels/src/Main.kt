fun main() {
    fun main() {
        var number =0
//the outer keyword is a label
        //in this targets the outer loop
        outer@ while (number < 10){
            println(number)
            number++
            var i = 0
            while (i <20){

                if (i == 0) break@outer

                println("''$i")
                i++
            }
        }
    }
}