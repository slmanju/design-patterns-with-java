package com.slmanju.patterns;

public class JungleWeaponStore extends WeaponStore {

    @Override
    protected Weapon createWeapon(WeaponType weaponType) {
        switch (weaponType) {
            case RIFLE:
                return new Rifle();
            case SHOTGUN:
                return new Shotgun();
            default:
                return new NullWeapon();
        }
    }

}
