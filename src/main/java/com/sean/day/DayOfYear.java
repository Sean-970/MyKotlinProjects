package com.sean.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DayOfYear {
    public static void main(String[] args) {
        LocalDate();
//        date();
    }

    private static void LocalDate() {
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm;ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(10))); //+10hours
        LocalDateTime otherDay = LocalDateTime.of(2025,1,1,15,25, 3);
        System.out.println(otherDay);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm;ss");
        System.out.println(formatter1.format(otherDay));
    }

    private static void date() {
        Date date = new Date();
        System.out.println(date);
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) +1;
        int day = now.get(Calendar.DATE);
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30,31, 30,31};
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
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm;ss");
            System.out.println(sdf.format(date));
            for(int i = 0; i<month-1; i++){
                day += months[i];
            }
            int days = day++;
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
