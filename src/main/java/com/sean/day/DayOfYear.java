package com.sean.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class DayOfYear {
    public static void main(String[] args) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30,31, 30,31};
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) +1;
        int day = now.get(Calendar.DATE);
        Date date = new Date();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Your Year");
            String yearString = br.readLine();
            year = (!yearString.isEmpty()) ? Integer.parseInt(yearString) : year;
            System.out.println(year);

            System.out.println("Enter Your Month");
            String monthString = br.readLine();
            month = (!monthString.isEmpty()) ? Integer.parseInt(monthString) : month;
            System.out.println(month);

            System.out.println("Enter Your Day");
            String dayString = br.readLine();
            day = (!dayString.isEmpty()) ? Integer.parseInt(monthString) : day;
            System.out.println(day);

            System.out.println(year + "/" + month + "/" + day );
            System.out.println(date);
            int days = 0;
            for(int i = 0; i<month-1; i++){
                days += months[i];
            }
            days+=day;
            System.out.println(days);

            if(isLeapYear(year)){
                System.out.println(year + "\t is Leap Year");
            }else{
                System.out.println(year + "\t isn't Leap Year");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Boolean isLeapYear(int years){
        if(years%400==0 || years%4==0 && years%100!=0){
            return true;
        }else {
            return false;
        }
    }

}
