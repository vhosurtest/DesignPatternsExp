package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(String filename) {
        boolean fileHandled = doHandle(filename);

        if (fileHandled) {
            return;
        }

        if (next != null) {
            next.handle(filename);
        } else {
            throw new UnsupportedOperationException("File format not supported.");
        }
    }

    protected abstract boolean doHandle(String filename);
}
