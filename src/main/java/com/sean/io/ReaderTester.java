package com.sean.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists()); //存不存在
        System.out.println(file.getAbsoluteFile());//查path
        try {
            FileInputStream fin = new FileInputStream(file);
            int n = fin.read();
            while( n != -1){
                System.out.print((char)n);
                n = fin.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("open success");
    }

}

