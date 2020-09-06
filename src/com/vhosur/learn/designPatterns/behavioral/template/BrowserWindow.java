package com.vhosur.learn.designPatterns.behavioral.template;

public class BrowserWindow extends Window {
    @Override
    protected void doBeforeClose() {
        System.out.println("Saving items before closing browser window");
    }

    @Override
    protected void doAfterClose() {

    }
}
