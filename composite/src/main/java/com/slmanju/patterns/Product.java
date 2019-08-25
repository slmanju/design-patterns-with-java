package com.slmanju.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

    private String name;
    private int price;
    private List<Product> items;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public void addItems(Product... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Name > " + name);
        System.out.println("Price > " + price);
        if (!items.isEmpty()) {
            System.out.println("Items >");
            items.forEach(Product::print);
        }
    }

}
