package com.vhosur.learn.designPatterns.structural.composite;

public class Truck implements Member {
    @Override
    public void deploy() {
        System.out.println("Deploying truck");
    }
}
