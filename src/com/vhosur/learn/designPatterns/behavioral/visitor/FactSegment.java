package com.vhosur.learn.designPatterns.behavioral.visitor;

public class FactSegment extends Segment {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
