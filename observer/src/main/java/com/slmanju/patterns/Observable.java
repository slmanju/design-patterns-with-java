package com.slmanju.patterns;

public interface Observable {

    void attachObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendNotification();

}
