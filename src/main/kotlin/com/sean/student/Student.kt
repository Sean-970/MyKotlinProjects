package com.sean.kotlin

fun main() {
    println("test")
    val s1 = Student("Sean",80,70)
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