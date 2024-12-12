package com.sean.kotlin

fun main() {
    val scanner = java.util.Scanner(System.`in`); // 關鍵字 + `
    println("Enter your name:")
    var name = scanner.nextLine();
    println("Hello $name")
    println("Enter your english score :")
    var english = scanner.nextInt();
    println("Enter your math score :")
    var math = scanner.nextInt();
    val s1 = Student(name,english,math)
    s1.print()
}
class Student (var name : String,var english : Int,var math : Int){
    fun print(){
        println(
            ("Name:" + name + "\t" + english + "\t" + math + "\t" + "Avg:"
                    + (math + english) / 2)
        );
    }
}