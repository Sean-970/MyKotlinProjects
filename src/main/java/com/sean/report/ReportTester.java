package com.sean.report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report health = new HealthReport();
        Report finance = new FinanceReport();
        List<Report> reports = new ArrayList<>();
        reports.add(health);
        reports.add(finance);
        for(Report report :reports){
            report.load();
            report.print();
        }
    }



}
