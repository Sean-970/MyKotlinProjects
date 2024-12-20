package com.sean.report;

public class FinanceReport implements Report{
    @Override
    public void print() {
        System.out.println("print finance");
    }

    @Override
    public void load() {
        System.out.println("load finance");
    }
}
