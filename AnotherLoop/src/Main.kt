fun main() {
//    var num1 = 0
//
//    while (num1 < 10) {
//        num1++
//        if (num1 in 3..7) {
//            continue //is skipped
//        }
//        println(num1)
//
//    }
//
    var num1 = 0

    while (num1 < 10) {
        num1++
        if (num1 == 7) {
            break//code is stopped
        }
        println(num1)
    }
        //second loop
    for (i in 1..10){
        if (i in 3..8){
            continue
        }
        println(i)
    }

}