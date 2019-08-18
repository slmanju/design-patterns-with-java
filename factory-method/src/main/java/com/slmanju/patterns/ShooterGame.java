package com.slmanju.patterns;

public class ShooterGame {

    public static void main(String[] args) {
        WeaponStore weaponStore = new JungleWeaponStore();
        Weapon weapon = weaponStore.purchase(WeaponType.RIFLE);
        Warrior warrior = new Warrior(weapon);
        warrior.fight();

        weapon = weaponStore.purchase(WeaponType.SHOTGUN);
        warrior.setWeapon(weapon);
        warrior.fight();
    }

}
