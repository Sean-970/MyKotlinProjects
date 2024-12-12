package com.sean;

public class Person {
    String name;
    String tel;
    float weight;
    float height;

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }
    public void hello(){
        System.out.println("person : hello");
    }
}
