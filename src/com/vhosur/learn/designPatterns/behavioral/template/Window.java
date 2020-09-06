package com.vhosur.learn.designPatterns.behavioral.template;

public abstract class Window {
    public void close() {
        doBeforeClose();
        System.out.println("Closing the window");
        doAfterClose();
    }

    protected abstract void doBeforeClose();
    protected abstract void doAfterClose();
}
