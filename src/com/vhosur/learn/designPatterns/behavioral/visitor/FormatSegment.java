package com.vhosur.learn.designPatterns.behavioral.visitor;

public class FormatSegment extends Segment {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
