package com.sean

fun main() {
//    println("Hello Kotlin");
//    Human().Hello();
    var human = Human();
    human.Hello();
    val age : Int = 19; //val 名稱 : 型態 = 值
    //val 不可改變 var 可變

    var weight = 66.5f;
    var name : String;
    name = "Sean";
}
class Human{
    fun Hello(){
        println("Hello Kotlin");
    }
}