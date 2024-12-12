package com.sean;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person person = new Person();
        person.hello();
        person.height = 1.8f;
        person.weight = 60.5f;
        person.name = "Sean";
        System.out.println(person.bmi());
        /*int i = 5;
        Integer i1 = 3;
        System.out.println(i1.byteValue());
        char c = '好';
        Character c1 = '你';
        byte b = 127;
        float weight = 60.5f;
        long l = 31131243;
        boolean whether = true;
        String name = "Sean";*/
    }
}
