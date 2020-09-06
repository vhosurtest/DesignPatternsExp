package com.vhosur.learn.designPatterns.behavioral.command.undo;

public class HTMLDocument {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public HTMLDocument(String content) {
        this.content = content;
    }

    public void makeBold() {
        this.setContent("<b>" + content + "<\\b>");
    }
}
