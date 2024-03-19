fun main(){
    //comparing strings
    //The compareTo(string) function compares two strings and returns 0 if both are equal

    var text1 = "hello world"
    var text2 = "world hello"

    println(text1.compareTo(text2))

    //finding a string in a string using indexOf()
    var text3 = "some random string typed here"

    println(text3.indexOf("random"))//finds the string 'random' in text3

    //joining two or more strings using '+' or .plus()

    var firstWord = "codding"
    var secondWord = "rules! "

    println(firstWord.plus(secondWord))

    //string interpolation (also used to add ) syntax: $

    var firstName = "William"
    var secondName = "Doe"

    println("My name is $firstName $secondName")
}