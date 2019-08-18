package com.slmanju.patterns;

public class Warrior {

    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.fire();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
