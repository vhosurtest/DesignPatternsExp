package com.vhosur.learn.designPatterns.behavioral.state;

public class Bicycle implements TravelMode {
    @Override
    public Object getEta(TravelMode travelMode) {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection(TravelMode travelMode) {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
