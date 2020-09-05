package com.vhosur.learn.designPatterns.behavioral.command.composite;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

public class EnrichCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Enriching image!");
    }
}
