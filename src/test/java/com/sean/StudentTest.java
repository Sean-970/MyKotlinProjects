package com.sean;

import com.sean.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void avgTest(){
        Student s1 = new Student("SEAN", 80, 80);
        Assertions.assertEquals((80+80) / 2, s1.avg());
    }
    @Test
    public void highestTest(){
        Student s1 = new Student("Sean", 80, 90);
        Assertions.assertEquals(90,s1.highest());
    }
}
