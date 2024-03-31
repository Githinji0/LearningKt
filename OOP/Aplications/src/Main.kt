package com.example.main
fun main() {
    val willAcc = Account("william")

}
class Account(val accountName: String){}
var balance = 0
var transactions = mutableListOf<Int>()

fun deposit(ammount: Int){
    if (ammount>0){
        transactions.add(ammount)
        balance+=ammount
        println("$ammount deposited.Balance is now${this.balance}")
    }
    fun withdrawal(withdrawal: Int){
        if (withdrawal<0){
            transactions.add(withdrawal)
            this.balance += withdrawal
            println("$withdrawal deposit.balance is now: ${this.balance}")

        }
        else{
            println("error")
        }
    }
    fun calculateBalance():Int{
        this.balance = 0
        for (i in transactions){
            this.balance+=transactions
        }
        return this.balance
    }
}