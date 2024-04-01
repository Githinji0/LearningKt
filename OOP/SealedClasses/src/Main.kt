//Sealed classes and interfaces provide controlled inheritance of your class hierarchies
fun main() {
    val success = Result.Success("success..!")

    fetchData(success)
}
fun fetchData(result: Result){
    when(result){

        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()

    }
}
sealed class Result(val message:String){
    fun showMessage(){
        println("result is $message")
    }
    sealed class Error (message: String): Result(message){
        class RecovrableError(exception: Exception, message: String): Error(message)
        class NonRecovrableError(exception: Exception, message: String): Error(message)
    }

    class Success (message: String): Result(message)
}
