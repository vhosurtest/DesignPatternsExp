package com.vhosur.learn.designPatterns.structural.decorator;

public class MainArtefact implements Artefact{
    private Artefact artefact;

    public MainArtefact(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public void render() {
        artefact.render();
        System.out.print(" + Main icon");
    }
}
