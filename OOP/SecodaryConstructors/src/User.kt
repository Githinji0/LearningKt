class User(var name: String, var lastName: String, var age: Int) {

    constructor(name: String) : this(name, "User", 0) {
        println("2nd")
    }


    constructor(name: String, lastName: String) : this(name, lastName, 0) {
        println("3rd")
    }
}