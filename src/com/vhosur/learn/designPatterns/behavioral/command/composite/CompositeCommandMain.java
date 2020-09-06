package com.vhosur.learn.designPatterns.behavioral.command.composite;

public class CompositeCommandMain {
    public static void main(String[] args) {
        var blackAndWhiteCommand = new BlackAndWhiteCommand();
        var enrichCommand = new EnrichCommand();

        var compositeCommand = new CompositeCommand();
        compositeCommand.add(blackAndWhiteCommand);
        compositeCommand.add(enrichCommand);

        compositeCommand.execute();
        compositeCommand.execute();
        compositeCommand.execute();
    }
}
