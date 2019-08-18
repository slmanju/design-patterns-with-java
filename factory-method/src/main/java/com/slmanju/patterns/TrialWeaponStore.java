package com.slmanju.patterns;

public class TrialWeaponStore extends WeaponStore {

    @Override
    protected Weapon createWeapon(WeaponType weaponType) {
        switch (weaponType) {
            case RIFLE:
                return new TrialRifle();
            case SHOTGUN:
                return new TrialShotgun();
            default:
                return new NullWeapon();
        }
    }

}
