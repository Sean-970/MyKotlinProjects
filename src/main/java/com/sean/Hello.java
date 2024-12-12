package com.sean;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person person = new Person("Sean","09123456789",66.5f,1.8f);
        Person person1 = new Person("小名","09123456789",59.5f,1.6f);
        person.hello();
        System.out.println("Name:" + (person.name) +" " +  person.bmi());
        System.out.println("Name:" + (person1.name) +" " +  person1.bmi());
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
