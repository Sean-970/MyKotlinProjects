package com.sean.student;

public class Graduate extends Student{
    int chinese;
    static int pass = 70;
    public Graduate(String name, int math, int english, int chinese){
        super(name, english, math);
        this.chinese = chinese;
    }

    @Override
    public void print() {
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
        System.out.println(name + "\t" + math + "\t" + english + "\t" + chinese + "\t" + avg() + "\t" +
                ((avg >= pass) ? "Pass" : "Fail") +"\t" + grade );
    }

    @Override
    public int avg() {
        return (math + english + chinese) / 3;
    }
}
