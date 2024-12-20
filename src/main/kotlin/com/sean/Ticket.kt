package com.sean.kotlin

import kotlin.random.Random

data class Ticket(val origin : String, val destination : Int, val price : Int)

fun main() {
    var ticket = Ticket("30",40,50)
    val s = "dadadT"
    println(s.validate())
    println((1..100).random())
}
fun String.validate() : Boolean {
    this.length >= 6
    return true
}
fun IntRange.random() : Int {
    val r = Random.nextInt(endInclusive-start) + start
    return r
}
