package com.sean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person p = new Person(62.5f,1.8f);
        Assertions.assertEquals(62.5f/(1.8f*1.8f),p.bmi());
    }


}
