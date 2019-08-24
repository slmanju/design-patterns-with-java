package com.slmanju.patterns;

public class CloudySky extends AbstractSky {

    public CloudySky(Sky sky) {
        super(sky);
    }

    @Override
    public void draw() {
        sky.draw();
        System.out.println("Drawing clouds");
    }

}
