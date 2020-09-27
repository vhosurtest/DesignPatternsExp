package com.vhosur.learn.designPatterns.structural.decorator;

public class ErrorArtefact implements Artefact{
    private Artefact artefact;

    public ErrorArtefact(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public void render() {
        artefact.render();
        System.out.print(" + Error icon");
    }
}
