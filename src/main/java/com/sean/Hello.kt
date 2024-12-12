package com.sean

fun main() {
//    println("Hello Kotlin");
//    Human().Hello();
    var human = Human(60.5f,1.8f);
    human.Hello();
    println(human.bmi())
    val age : Int = 19;      // 名稱 : 型態 = 值
    //val 不可改變 var 可變

    var weight = 66.5f;
    var name : String;
    name = "Sean";
}
class Human( var weight : Float,var height : Float){
    fun bmi() : Float {
        var  bmi = weight / (height * height)
        return bmi;
    }
    fun Hello(){
        println("Hello Kotlin");
    }
}