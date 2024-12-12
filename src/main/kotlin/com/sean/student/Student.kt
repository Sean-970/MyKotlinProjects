package com.sean.kotlin

import java.util.*

fun main() {
//    userInput()
}

private fun userInput() {
    val scanner = Scanner(System.`in`); // in關鍵字 + `
    println("Enter your name:")
//    var name = scanner.nextLine();
    var name = null

    println("Hello $name")
    println("Enter your english score :")
    var english = scanner.nextInt();
    println("Enter your math score :")
    var math = scanner.nextInt();
    val s1 = Student(name, english, math)
    s1.print()
    s1.checkName()
}

class Student (var name : String?,var english : Int,var math : Int){
    fun print(){
        println(
            ("Name:" + name + "\t" + english + "\t" + math + "\t" + "Avg:"
                    + (math + english) / 2)
        );
    }
    fun checkName(){
        println(name?.length)
    }
}