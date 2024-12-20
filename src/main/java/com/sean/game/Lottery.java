package com.sean.game;

import java.util.HashSet;
import java.util.Set;

public abstract class Lottery {
    static Set<Integer> numbers = new HashSet<>();
    int numberCount = 0 ;
    public abstract void generate();
    public  boolean checkNumber(){
        if (numbers.size() == numberCount){
            return true;
        }else
            return false;
    }
}
