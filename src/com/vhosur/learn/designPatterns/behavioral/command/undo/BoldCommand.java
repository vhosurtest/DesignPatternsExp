package com.vhosur.learn.designPatterns.behavioral.command.undo;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private HTMLDocument document;
    private History history;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        this.prevContent = this.document.getContent();
        this.document.makeBold();
        this.history.push(this);
    }

    @Override
    public void unexecute() {
        this.document.setContent(prevContent);
    }
}
