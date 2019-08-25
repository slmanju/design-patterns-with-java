package com.slmanju.patterns;

public class Dotharaki extends Soldier {

    private String state = "";

    public Dotharaki(int position) {
        super(position);
        initialize();
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void draw() {
        System.out.println("Drawing dotharaki at " + position + " with state " + state);
    }

    @Override
    protected Soldier clone() throws CloneNotSupportedException {
        Soldier soldier = super.clone();
        initialize();
        return soldier;
    }

    private void initialize() {
        state = "with-horse";
    }

}
