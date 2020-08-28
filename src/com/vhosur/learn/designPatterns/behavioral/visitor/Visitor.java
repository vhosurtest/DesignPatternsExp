package com.vhosur.learn.designPatterns.behavioral.visitor;

public interface Visitor {
    public abstract void visit(FactSegment factSegment);
    public abstract void visit(FormatSegment formatSegment);
}
