package com.vhosur.learn.designPatterns.behavioral.command.undo;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        this.history.pop().unexecute();
    }
}
