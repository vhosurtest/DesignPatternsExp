package com.vhosur.learn.designPatterns.behavioral.command.fx;

public class Button {
    private String title;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
