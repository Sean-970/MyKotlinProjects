package com.sean.kotlin

import java.util.*

fun main() {
//    userInput()
    var s1 = Student("Sean", 10, 50)
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
        println("$name\t$english\t$math\t${avg()}\t${grading()}\t${passOrFail()}");
    }

    fun checkName() = println(name?.length)
    fun avg() = ((math + english) / 2)
    fun passOrFail() = if (avg() > 60) "PASS" else "FAIL"

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }
    fun grading() = when(avg()) {
          in 90..100 -> 'A'
          in 80..89 -> 'B'
          in 70..79 -> 'C'
          in 60..69 -> 'D'
        else -> 'F'
    }

}