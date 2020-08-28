package com.vhosur.learn.designPatterns.behavioral.state;

public class Walk implements TravelMode {
    @Override
    public Object getEta(TravelMode travelMode) {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection(TravelMode travelMode) {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
