package com.vhosur.learn.designPatterns.behavioral.state;

public class Transit implements TravelMode {
    @Override
    public Object getEta(TravelMode travelMode) {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection(TravelMode travelMode) {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
