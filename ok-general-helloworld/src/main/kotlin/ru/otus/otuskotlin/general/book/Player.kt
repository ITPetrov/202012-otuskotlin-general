package ru.otus.otuskotlin.general.book

class Player (_name: String,
              var hPoints:Int) {
    var name=_name
        get()=field.capitalize()
        set(value){
        field=value.trim()
        }
    constructor(name: String) :this (name,hPoints=100){
        if (name=="Ivanov") hPoints=500
    }
}
class Dice(){
    val rolledValue
        get()=(1..6).shuffled().first()
}