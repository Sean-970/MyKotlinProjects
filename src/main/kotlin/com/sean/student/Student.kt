package com.sean.kotlin

import java.util.*

fun main() {
//    userInput()
    var s1 = Student("Sean", 90, 99)
    s1.print()
    println("High score:${s1.highest()}")
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
    fun highest(): Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
            return max
        }

    fun checkName(){
        println(name?.length)
    }
}