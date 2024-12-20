package com.sean;

public class Ticket {
    String origin;
    String destination;
    int price;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ticket(String origin, String destination, int price) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }
}
