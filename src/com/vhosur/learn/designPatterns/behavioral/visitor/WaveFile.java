package com.vhosur.learn.designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class WaveFile {
    private List<Segment> segments = new ArrayList<>();

    public static WaveFile read(String filename) {
        var waveFile = new WaveFile();
        waveFile.segments.add(new FormatSegment());
        waveFile.segments.add(new FactSegment());
        waveFile.segments.add(new FactSegment());
        waveFile.segments.add(new FactSegment());

        return waveFile;
    }

    public void applyFilter(Visitor visitor) {
        for (var segment : segments) {
            segment.accept(visitor);
        }
    }
}
