package ru.otus.otuskotlin.general.hello.world

import java.lang.RuntimeException

fun main() {
    println("Hello Big World!")

    val x: Int? =null
    //val y=x?.toDouble() ?: throw RuntimeException ("null is not allowed here!!!!")
    if (x!=null) {
        print("")
    }
}