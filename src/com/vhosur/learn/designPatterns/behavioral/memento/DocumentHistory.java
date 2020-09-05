package com.vhosur.learn.designPatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DocumentHistory {
    private final Deque<DocumentState> documentStates = new ArrayDeque<>();

    public void push(DocumentState documentState) {
        this.documentStates.add(documentState);
    }

    public DocumentState pop() {
        return this.documentStates.pop();
    }
}
