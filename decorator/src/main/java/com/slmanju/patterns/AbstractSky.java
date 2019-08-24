package com.slmanju.patterns;

public abstract class AbstractSky implements Sky {

    protected Sky sky;

    public AbstractSky(Sky sky) {
        this.sky = sky;
    }

}
