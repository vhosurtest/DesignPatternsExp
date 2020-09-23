package com.vhosur.learn.designPatterns.structural.composite;

public class HumanResource implements Member {
    @Override
    public void deploy() {
        System.out.println("Deploying human resource");
    }
}
