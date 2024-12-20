package com.sean.kotlin

import com.sean.kotlin.Student.Companion
import java.util.*

fun main() {
//    userInput()
    var s1 = Student("Sean", 60, 50)
    s1.print()
//    println("High score:${s1.highest()}")
    var g1 = Graduate("Sean", 60, 90,90)
    g1.print()

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
class Graduate(name: String?, english: Int, math: Int, var chinese: Int) : Student(name,english,math){
    companion object{
        var pass = 70;
    }
    override fun print() = println("$name\t$english\t$math\t$chinese\t${avg()}\t${grading()}\t${passOrFail()}");
    override fun avg() = ((math + english + chinese) / 3)
    override fun passOrFail() = if (avg() > com.sean.kotlin.Student.pass) "PASS" else "FAIL"
}
open class Student (var name : String?,var english : Int,var math : Int){
    companion object{
        @JvmStatic
        var pass = 60;
    }
    open fun print(){
        println("$name\t$english\t$math\t${avg()}\t${grading()}\t${passOrFail()}");

    }

    fun checkName() = println(name?.length)
    open fun avg() = ((math + english) / 2)
    open fun passOrFail() = if (avg() > pass) "PASS" else "FAIL"

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