package com.slmanju.patterns;

public class Printer {

    private static class SingletonHolder {
        private static final Printer INSTANCE = new Printer();
    }

    public static Printer getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void print(String message) {
        System.out.println(message);
    }

}
