package com.slmanju.patterns;

// factory
public abstract class WeaponStore {

    public final Weapon purchase(WeaponType weaponType) {
        Weapon weapon = createWeapon(weaponType);
        weapon.load();
        return weapon;
    }

    // factory method
    protected abstract Weapon createWeapon(WeaponType weaponType);

}
