package com.vhosur.learn.designPatterns.behavioral.visitor;

public class NormalizeVisitor implements Visitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Normalize the fact segment");
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Normalize the format segment");
    }
}
