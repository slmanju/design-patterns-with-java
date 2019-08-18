package com.slmanju.patterns;

public class Rifle extends Weapon {

    @Override
    public void fire() {
        System.out.println("Firing with rifle.");
    }

    @Override
    public void load() {
        System.out.println("Loading bullets into rifle.");
    }

}
