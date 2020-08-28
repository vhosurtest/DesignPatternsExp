package com.vhosur.learn.designPatterns.behavioral.visitor;

public class VisitorPatternMain {
    public static void main(String[] args) {
        var wavefile = WaveFile.read("testfile.wav");
        var normalizeVisitor = new NormalizeVisitor();
        wavefile.applyFilter(normalizeVisitor);
        var addReverbVisitor = new AddReverbVisitor();
        wavefile.applyFilter(addReverbVisitor);
        var reduceNoiseVisitor = new ReduceNoiseVisitor();
        wavefile.applyFilter(reduceNoiseVisitor);
    }
}
