package com.slmanju.patterns;

public class TrialRifle extends Weapon {

    @Override
    public void fire() {
        System.out.println("Firing with rifle trial version.");
    }

    @Override
    public void load() {
        System.out.println("Loading bullets into rifle trail version.");
    }

}
