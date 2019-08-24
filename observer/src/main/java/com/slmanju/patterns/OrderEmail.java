package com.slmanju.patterns;

public class OrderEmail implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Sending order email");
    }

}
