fun main() {
    val clickListener = ClickListener()

    var loginButton = Button("Login",123,object: OnClickListener{
        override fun onClick() {
            //code to log in the user
        }

    } )
    var signUpButton = Button("Sign Up",1293,object: OnClickListener{
        override fun onClick() {
            //code to sign up the user
        }

    } )

}
class Button(var name: String,var id:Int,onClickListener: OnClickListener)

class ClickListener():OnClickListener {
    override fun onClick() {

    }
}

interface OnClickListener{
    fun onClick()
}
