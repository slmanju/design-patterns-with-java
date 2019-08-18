package com.slmanju.patterns;

public class Shotgun extends Weapon {

    @Override
    public void fire() {
        System.out.println("Firing with shotgun.");
    }

    @Override
    public void load() {
        System.out.println("Loading bullets into shotgun.");
    }

}
