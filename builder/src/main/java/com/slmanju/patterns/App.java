package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        Player player = new Player.Builder("nero").withWeapon("sniper").withHair("curly").build();

        System.out.println(player);
    }

}
