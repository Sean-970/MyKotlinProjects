package com.sean.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int avg(){
        return (math + english) / 2;
    }

    public void print(){
        int avg = avg();
        char grade = 'F';
        switch (avg() / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println(name + "\t" + math + "\t" + english + "\t" + avg() + "\t" +
                ((avg >= pass) ? "Pass" : "Fail") +"\t" + grade );
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
