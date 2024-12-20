package com.sean.game;

import com.sean.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigLottery extends Lottery {

    @Override
    public void generate() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(48) + 1;
            numbers.add(number);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        BigLottery bigLottery = new BigLottery();
        bigLottery.generate();
    }
}
