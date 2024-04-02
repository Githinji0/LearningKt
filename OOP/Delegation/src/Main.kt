fun main() {
    //allows the transfer of certain functionalities to another class or property with the help of the by keyword.
}
class App: A by FirstDelegate(),B by SecondDelegate(){
    override fun print1() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }

}

interface A {
    fun print1()
}

interface B {
    fun print2()
}

open class SecondDelegate: B {

    override fun print2() {

    }
}
open class FirstDelegate: A {
    override fun print1() {

    }
}