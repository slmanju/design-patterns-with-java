package com.slmanju.patterns;

public class App  {

    public static void main(String[] args) {
        Sky night = new NightSky();
        night = new StarSky(night);
        night = new CloudySky(night);
        night.draw();

        System.out.println("---------");

        Sky sky = new RainySky(new CloudySky(new NoonSky()));
        sky.draw();
    }

}
