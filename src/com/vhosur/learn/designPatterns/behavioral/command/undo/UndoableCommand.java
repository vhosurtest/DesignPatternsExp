package com.vhosur.learn.designPatterns.behavioral.command.undo;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

public interface UndoableCommand extends Command{
    void unexecute();
}
