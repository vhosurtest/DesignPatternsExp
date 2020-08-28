package com.vhosur.learn.designPatterns.behavioral.visitor;

public class VisitorPatternMain {
    public static void main(String[] args) {
        var wavefile = WaveFile.read("testfile.wav");
        var normalizeVisitor = new NormalizeVisitor();
        wavefile.applyFilter(normalizeVisitor);
    }
}
