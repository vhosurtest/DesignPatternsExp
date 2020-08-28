package com.vhosur.learn.designPatterns.behavioral.state;

public class StatePatternMain {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        directionService.setTravelMode(new Drive());
        directionService.getDirection();
        directionService.getEta();

        directionService.setTravelMode(new Bicycle());
        directionService.getDirection();
        directionService.getEta();

        directionService.setTravelMode(new Walk());
        directionService.getDirection();
        directionService.getEta();

        directionService.setTravelMode(new Transit());
        directionService.getDirection();
        directionService.getEta();
    }
}
