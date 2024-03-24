fun  main() {
    //null has no memory refference
    val text: string? = "name is"
    text = null
    //safe call operator '?.'
    if(text != null){
        println("text isnt null")

    }
    else{
        println("null")
    }


}