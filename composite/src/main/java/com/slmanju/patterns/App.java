package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        Product mango = new Product("Mango", 100);
        mango.print();

        Product apple = new Product("Apple", 80);
        Product basket = new Product("Basket", 170);
        basket.addItems(mango, apple);
        basket.print();
    }

}
