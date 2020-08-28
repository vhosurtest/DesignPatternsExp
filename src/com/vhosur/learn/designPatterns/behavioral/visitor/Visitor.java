package com.vhosur.learn.designPatterns.behavioral.visitor;

public interface Visitor {
    void visit(FactSegment factSegment);
    void visit(FormatSegment formatSegment);
}
