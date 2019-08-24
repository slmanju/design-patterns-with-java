package com.slmanju.patterns;

public class StarSky extends AbstractSky {

    public StarSky(Sky sky) {
        super(sky);
    }

    @Override
    public void draw() {
        sky.draw();
        System.out.println("Drawing stars");
    }

}
