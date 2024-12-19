package com.sean

import kotlin.random.Random

fun main() {
//    var scanner = (System.`in`)
    var answer = Random.nextInt(10) + 1
    var number = 0
    while (answer != number) {
        println("enter your number")
        number = readLine()!!.toInt()
        if (answer < number){
            println("lower")
        }else if (answer > number){
            println("higher")
        }else{
            println("bingo , answer is $answer")
        }
    }
}