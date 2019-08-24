package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        Order order = new Order();
        order.attachObserver(new OrderPrinter());
        order.attachObserver(new OrderEmail());

        order.complete();
    }

}
