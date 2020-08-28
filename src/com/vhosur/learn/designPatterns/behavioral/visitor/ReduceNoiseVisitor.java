package com.vhosur.learn.designPatterns.behavioral.visitor;

public class ReduceNoiseVisitor implements Visitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Reduce noise for fact segment");
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Reduce oise for format segment");
    }
}
