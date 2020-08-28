package com.vhosur.learn.designPatterns.behavioral.state;

public class Drive implements TravelMode {
    @Override
    public Object getEta(TravelMode travelMode) {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection(TravelMode travelMode) {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
