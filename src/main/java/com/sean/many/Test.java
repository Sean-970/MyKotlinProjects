package com.sean.many;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        map();
//
//        set();
//        List();
//        arrayTest();
    }

    private static void map() {
        HashMap<String,String> player = new HashMap<>();
        player.put("OKC","SGA");
        player.put("MIL","Gennis");
        player.put("DEN","NiCOLA");
        player.put("DEN","NIKOLA");
        System.out.println(player);
        for(String players : player.keySet()){
            System.out.println(player.get(players));
        }
    }

    private static void set() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println(set);
        for(int n : set){
            System.out.println(n);
        }
    }

    private static void List() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        System.out.println(arrayList);
        List<Integer> lists = Arrays.asList(33,44,55,66,77);
        for( int list:lists){
            System.out.println(list);
        }
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
