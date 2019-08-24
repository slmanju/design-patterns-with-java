package com.slmanju.patterns;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private List<Observer> observers;

    public Order() {
        this.observers = new ArrayList<>();
    }

    public void complete() {
        System.out.println("Completing the order");
        sendNotification();
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        observers.forEach(observer -> observer.update(this));
    }

}
