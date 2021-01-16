package ru.otus.otuskotlin.general.hello.world

class Player {
    var name="ivan"
    get()=field.capitalize()
    set(value){
        field=value.trim()
    }
}