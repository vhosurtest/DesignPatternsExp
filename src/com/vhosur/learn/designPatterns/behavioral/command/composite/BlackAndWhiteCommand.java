package com.vhosur.learn.designPatterns.behavioral.command.composite;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Applying black and white filter to image");
    }
}
