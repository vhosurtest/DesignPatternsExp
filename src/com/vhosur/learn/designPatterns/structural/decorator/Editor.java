package com.vhosur.learn.designPatterns.structural.decorator;

import com.sun.tools.javac.Main;

public class Editor {
    public void openProject() {
        Artefact[] artefacts = {
                new MainArtefact(new PlainArtefact("Main")),
                new PlainArtefact("Demo"),
                new ErrorArtefact(new PlainArtefact("EmailClient")),
                new ErrorArtefact(new MainArtefact(new PlainArtefact("EmailProvider"))),
        };

        for (var artefact : artefacts) {
            artefact.render();
            System.out.println();
        }
    }
}
