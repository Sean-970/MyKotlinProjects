package com.sean.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        com.sean.kotlin.Student s1 = new com.sean.kotlin.Student("Sean",60,50);


    }

    private static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your english:");
        int english = sc.nextInt();
        System.out.println("Enter your math:");
        int math = sc.nextInt();
        Student s1 = new Student(name,english,math);
        s1.print();
        System.out.println("Highest score:" + s1.highest());
        sc.close();
    }
}
