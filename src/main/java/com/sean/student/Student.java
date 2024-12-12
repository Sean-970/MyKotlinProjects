package com.sean.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println("Name:" + name + "\t" + english + "\t" + math + "\t" + "Avg:"
            + (math + english) / 2);
    }
    public int highest(){
//        int max = 0;
//        if(math > english){
//            max = math;
//        }else{
//            max = english;
//        }
//        return max;
        return math > english ? math : english;
    }
}
