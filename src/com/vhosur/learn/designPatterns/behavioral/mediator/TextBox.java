package com.vhosur.learn.designPatterns.behavioral.mediator;

public class TextBox extends UIControl{
    protected String content = "";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyObservers();
    }
}
