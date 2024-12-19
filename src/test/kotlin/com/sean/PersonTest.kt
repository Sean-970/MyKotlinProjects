package com.sean.kotlin

import com.sean.Human1
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val human1 = Human1("Sean",62.5f,1.8f)
        Assertions.assertEquals(62.5f/(1.8f*1.8f),human1.bmi())
    }


}