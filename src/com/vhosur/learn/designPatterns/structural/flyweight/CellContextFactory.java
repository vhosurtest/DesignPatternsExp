package com.vhosur.learn.designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    private Map<Integer, CellContext> contexts = new HashMap<>();

    public CellContext getContext(String fontFamily, int fontSize, boolean isBold) {
        int hash = Objects.hash(fontFamily, fontSize, isBold);

        if (!contexts.containsKey(hash)) {
            contexts.put(hash, new CellContext(fontFamily, fontSize, isBold));
        }

        return contexts.get(hash);
    }
}
