package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public class QuickBooksHandler extends Handler {
    public QuickBooksHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        boolean isHandled = false;
        if (filename.endsWith(".qbs")) {
            System.out.println("Handling quickbook");
            isHandled = true;
        }
        return isHandled;
    }
}
