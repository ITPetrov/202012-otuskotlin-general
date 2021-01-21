package ru.otus.otuskotlin.general.book

class Player (_name: String,
              val health: Int) {
    var race ="DWARF"
    var town ="Bavaria"
    val name =_name
    val aligment: String
    private var age=0

    init {
        println ("initializing player")
        aligment ="GOOD"
    }
    constructor(_name: String) : this(_name,100){
        town ="The shire"
    }
}
fun main(){
    Player("Madrid")
}
