package com.vhosur.learn.designPatterns.behavioral.visitor;

public abstract class Segment {
    public abstract void accept(Visitor visitor);
}
