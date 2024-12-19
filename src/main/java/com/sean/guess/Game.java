package com.sean.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        System.out.println(answer);
        int number = 0;
        while (answer != number) {
            System.out.println("enter your number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (answer < number) {
                System.out.println("lower");
            } else if (answer > number) {
                System.out.println("higher");
            } else {
                System.out.println("bingo , number is " + answer);
            }
        }
    }
}
