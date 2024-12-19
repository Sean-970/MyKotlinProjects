package com.sean.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun avgTest(){
        val s = Student("Sean",80,90)
        Assertions.assertEquals((80+90)/2,s.avg())
    }
    @Test
    fun highestTest(){
        val s = Student("Sean",80,90)
        Assertions.assertEquals(90,s.highest())
    }
    @Test
    fun gradingTest(){
        val s = Student("Sean",80,90)
        Assertions.assertEquals('B',s.grading())
    }

}