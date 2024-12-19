package com.sean

import kotlin.random.Random

fun main() {
    var answer = Random.nextInt(10) +1;
    println(answer)
    for ( i in 1..4){
        println("enter your number")
        println("($i/4) times ")
        var number = readLine()!!.toInt()
        if (answer>number){
            println("higher")
        }else if (answer<number){
            println("lower")
        }else{
            println("bingo, number is $answer")
            break
        }
    }
}