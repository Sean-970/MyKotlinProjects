package com.sean

import java.net.HttpURLConnection
import java.net.URL

fun main() {
    var url = URL("https://datacenter.taichung.gov.tw/swagger/OpenData/d07814d4-a50d-4049-98b2-b925e0dec1d3")
    println(url.readText())
    with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().forEachLine {
            println(it)
        }
    }
}