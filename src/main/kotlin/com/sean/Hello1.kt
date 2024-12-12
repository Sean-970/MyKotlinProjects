package com.sean;

fun main() {
    var s:String? = "HelloWorld";
//    s = null
    println(s?.length);
    println(s?.get(3));
    println(s?.substring(3));
//    println("Hello Kotlin");
//    Human().Hello();
    val score  = 65;
    println(score > 80)
    val c : Char = 'A'
    println(c.toInt())
    println(c.toInt() > 60) //Char無法做比較 要轉型
    var human1 = Human1( name = "Sean",weight = 66.3f, height = 1.85f); //可以指定值
    human1.Hello();
    println(human1.bmi())
    val age : Int = 19;      // 名稱 : 型態 = 值
    //val 不可改變 var 可變

    var weight = 66.5f;
    var name : String;
    name = "Sean";
}
class Human1(var name : String = " ", var weight : Float, var height : Float){  //主要建構子
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