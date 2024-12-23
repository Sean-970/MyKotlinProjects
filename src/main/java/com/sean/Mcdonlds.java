package com.sean;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mcdonlds {
    Map<String,Item> menu = new HashMap<>();
    public static void main(String[] args) {
        Mcdonlds mcdonlds = new Mcdonlds();
        mcdonlds.printMenu();

    }
    public Mcdonlds(){
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null){
                String[] tokens = line.split(",");
                Item item = new Item(
                     tokens[0],
                     tokens[1],
                     Integer.parseInt(tokens[2]),
                     Integer.parseInt(tokens[3])
                );
                menu.put(item.id,item);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void printMenu(){
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }
}



class Item{
    String id;
    String name;
    int calorle;
    int price;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calorle + "\t" + price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorle() {
        return calorle;
    }

    public void setCalorle(int calorle) {
        this.calorle = calorle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String id, String name, int calorle, int price) {
        this.id = id;
        this.name = name;
        this.calorle = calorle;
        this.price = price;
    }
}
