package com.sean

fun main() {
    val list = listOf(1,2,3,4)  //不可改
    println(list)
    for ( lists in  list){
        println(lists)
    }

    var mutableList = mutableListOf(1,2,3,4,)  //可寫
        mutableList.add(5)
        println(mutableList)
}