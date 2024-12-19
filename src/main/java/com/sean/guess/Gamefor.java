package com.sean.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        int number = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("enter your number");
            number = sc.nextInt();
            System.out.println("(" + i + "/4) times");
            if (answer < number) {
                System.out.println("lower");
            } else if (answer > number) {
                System.out.println("higher");
            } else {
                System.out.println("bingo , number is " + answer);
                break;
            }
        }
    }
}
