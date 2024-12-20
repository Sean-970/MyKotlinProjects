package com.sean

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
//    File("data.txt").writeText("test")
//    write()
}

private fun write() {
    File("ouput.txt").bufferedWriter().use {
        it.write("1st\n")
        it.write("2nd\n")
        it.write("3rd\n")
    }
}
