package com.vhosur.learn.designPatterns.behavioral.command.undo;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        this.commands.add(command);
    }

    public UndoableCommand pop() {
        return this.commands.pop();
    }
}
