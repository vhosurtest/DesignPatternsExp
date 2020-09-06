package com.vhosur.learn.designPatterns.behavioral.command.undo;

public class UndoCommandMain {
    public static void main(String[] args) {
        HTMLDocument document = new HTMLDocument("Sample string");
        History history = new History();

        BoldCommand boldCommand = new BoldCommand(document, history);
        UndoCommand undoCommand = new UndoCommand(history);

        boldCommand.execute();
        System.out.println(document.getContent());
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
