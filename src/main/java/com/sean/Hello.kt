package com.sean

fun main() {
//    println("Hello Kotlin");
//    Human().Hello();
    var human = Human( name = "Sean",weight = 66.3f, height = 1.85f); //可以指定值
    human.Hello();
    println(human.bmi())
    val age : Int = 19;      // 名稱 : 型態 = 值
    //val 不可改變 var 可變

    var weight = 66.5f;
    var name : String;
    name = "Sean";
}
class Human(var name : String = " ",var weight : Float,var height : Float){  //主要建構子
    init {
        println("test $weight")
    }
    //constructor(name :String,weight: Float,height: Float) : this(weight, height) {}  //次要建構子不用var val


    fun bmi() : Float {
        var  bmi = weight / (height * height)
        return bmi;
    }
    fun Hello(){
        println("Hello Kotlin");
    }
}