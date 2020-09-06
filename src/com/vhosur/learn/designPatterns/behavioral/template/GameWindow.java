package com.vhosur.learn.designPatterns.behavioral.template;

public class GameWindow extends Window {
    @Override
    protected void doBeforeClose() {
        System.out.println("Saving user preferences before exiting game window");
    }

    @Override
    protected void doAfterClose() {
        System.out.println("Performing cleanup after closing game window");
    }
}
