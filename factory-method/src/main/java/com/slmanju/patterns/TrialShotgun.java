package com.slmanju.patterns;

public class TrialShotgun extends Weapon {

    @Override
    public void fire() {
        System.out.println("Firing with shotgun trial version.");
    }

    @Override
    public void load() {
        System.out.println("Loading bullets into shotgun trail version.");
    }

}
