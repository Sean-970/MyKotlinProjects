package com.sean;

public class Person {
    String name;
    String tel;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String tel, float weight, float height) {
        this(weight, height);
        this.name = name;
        this.tel = tel;
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }
    public void hello(){
        System.out.println("person : hello");
    }
}
