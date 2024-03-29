fun main() {
//    var instance = DataBase.detInstance()
//    println(instance)\pr
    println(DataBase)
    println(DataBase)
    println(DataBase)
    println(DataBase)
}

//class DataBase private constructor() {
//    companion object{
//        private var instance: DataBase? =null
//        fun detInstance(): DataBase? {
//            if (instance == null){
//                instance = DataBase()
//            }
//
//            return instance
//        }
//    }
//}
//singleTon
object DataBase{
    init {
        println("Database Created")
    }
}