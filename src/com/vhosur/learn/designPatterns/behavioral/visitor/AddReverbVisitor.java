package com.vhosur.learn.designPatterns.behavioral.visitor;

public class AddReverbVisitor implements Visitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Add reverb to fact segment");
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Add reverb to format segment");
    }
}
