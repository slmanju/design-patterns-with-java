package com.slmanju.patterns;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
//        withoutClone();
        withClone();
    }

    private static void withClone() {
        long start = System.currentTimeMillis();

        Soldier dotharaki = new Dotharaki(0);
        IntStream.rangeClosed(1, 10000).boxed().forEach(i -> {
            try {
                Soldier dotharakiClone = dotharaki.clone();
                dotharakiClone.setPosition(i);
                ((Dotharaki) dotharakiClone).setState(i % 100 == 0 ? "standing" : "with-horse");
                dotharakiClone.draw();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Taken " + (System.currentTimeMillis() - start));
    }

    private static void withoutClone() {
        long start = System.currentTimeMillis();

        IntStream.rangeClosed(1, 5).boxed().forEach(i -> {
            Soldier dotharaki = new Dotharaki(i);
            dotharaki.draw();
        });

        System.out.println("Taken " + (System.currentTimeMillis() - start));
    }

}
