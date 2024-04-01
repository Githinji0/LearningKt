fun main() {
    val view = View()
    val button = Button("login","center")
    var roundButton = RoundButton("Sign up","Bottom",40)
    button.draw()
    roundButton.draw()
    view.draw()


}
open class View(){
    open fun draw(){
        println("drawing....")
    }
}

open class Button(val text:String,val orientation:String): View(){
    override fun draw() {
        println("Drawing the button...")
        super.draw()
    }
}
class RoundButton(text: String,orientation: String,val roundness:Int): Button(text,orientation){
    override fun draw() {
        println("Drawing the round button....")
        super.draw()
    }
}