package com.slmanju.patterns;

public class OrderPrinter implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Printing order");
    }

}
