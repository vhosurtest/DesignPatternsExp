package com.vhosur.learn.designPatterns.behavioral.iterator;

public interface ProductIterator {
    boolean hasNext();
    Product currentItem();
    void next();
}
