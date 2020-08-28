package com.vhosur.learn.designPatterns.behavioral.state;

public class DirectionService {
    private TravelMode travelMode;

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta() {
        return this.travelMode.getEta(this.travelMode);
    }

    public Object getDirection() {
        return this.travelMode.getDirection(this.travelMode);
    }
}
