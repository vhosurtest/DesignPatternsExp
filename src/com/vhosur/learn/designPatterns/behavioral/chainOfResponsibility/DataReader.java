package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public class DataReader {
    private Handler next;

    public DataReader(Handler next) {
        this.next = next;
    }

    public void handle(String filename) {
        if (next != null) {
            next.handle(filename);
        }
    }
}
