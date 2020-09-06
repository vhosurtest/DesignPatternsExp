package com.vhosur.learn.designPatterns.behavioral.template;

public class AppWindow extends Window {
    @Override
    protected void doBeforeClose() {

    }

    @Override
    protected void doAfterClose() {
        System.out.println("Cleaning up after app window closed");
    }
}
