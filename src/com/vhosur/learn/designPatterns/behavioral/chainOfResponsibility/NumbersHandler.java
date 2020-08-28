package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public class NumbersHandler extends Handler{
    public NumbersHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        boolean isHandled = false;
        if (filename.endsWith(".numbers")) {
            System.out.println("Handling numbers file");
            isHandled = true;
        }
        return isHandled;
    }
}
