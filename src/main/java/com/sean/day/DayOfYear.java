package com.sean.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        String year = String.valueOf(now.get(Calendar.YEAR));
        String month = String.valueOf(now.get(Calendar.MONTH) +1);
        String day = String.valueOf(now.get(Calendar.DATE));
        Date date = new Date();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Your Year");
            String yearString = br.readLine();
            year = (!yearString.isEmpty()) ? yearString : year;
            System.out.println(year);

            System.out.println("Enter Your Month");
            String monthString = br.readLine();
            month = (!monthString.isEmpty()) ? monthString : month;
            System.out.println(month);

            System.out.println("Enter Your Day");
            String dayString = br.readLine();
            day = (!dayString.isEmpty()) ? monthString : day;
            System.out.println(day);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(year + "/" + month + "/" + day );
        System.out.println(date);
    }
}
