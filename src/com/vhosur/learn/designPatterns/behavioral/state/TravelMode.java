package com.vhosur.learn.designPatterns.behavioral.state;

public interface TravelMode {
    Object getEta(TravelMode travelMode);
    Object getDirection(TravelMode travelMode);
}
