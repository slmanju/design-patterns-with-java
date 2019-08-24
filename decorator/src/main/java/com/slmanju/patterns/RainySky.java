package com.slmanju.patterns;

public class RainySky extends AbstractSky {

    public RainySky(Sky sky) {
        super(sky);
    }

    @Override
    public void draw() {
        sky.draw();
        System.out.println("Drawing dark rainy clouds");
    }

}
