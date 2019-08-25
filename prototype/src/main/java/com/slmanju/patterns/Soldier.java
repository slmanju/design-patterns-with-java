package com.slmanju.patterns;

import java.util.concurrent.TimeUnit;

public abstract class Soldier implements Cloneable {

    protected int position;

    public Soldier(int position) {
        this.position = position;
        loadResources();
    }

    private void loadResources() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("just ignore");
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public abstract void draw();

    @Override
    protected Soldier clone() throws CloneNotSupportedException {
        Soldier soldier = (Soldier) super.clone();
        soldier.position = 0;
        return soldier;
    }
}
