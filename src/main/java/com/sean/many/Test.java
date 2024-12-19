package com.sean.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        System.out.println(arrayList);
        List<Integer> lists = Arrays.asList(33,44,55,66,77);
        for( int list:lists){
            System.out.println(list);
        }
        //        arrayTest();
    }

    private static void arrayTest() {
        int[] scores = {88,99,44,33,22};
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("-----------------");
        for( int n:scores){
            System.out.println(n);
        }
    }
}
