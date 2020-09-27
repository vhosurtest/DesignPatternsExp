package com.vhosur.learn.designPatterns.structural.decorator;

public class PlainArtefact implements Artefact{
    private String name;

    public PlainArtefact(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print(name);
    }
}
