package com.vhosur.learn.designPatterns.behavioral.iterator;

public class IteratorPatternMain {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        Product speakers = new Product(1, "Speakers");
        Product headset = new Product(2, "Headset");
        Product mouse = new Product(3, "Mouse");

        products.add(speakers);
        products.add(headset);
        products.add(mouse);

        ProductIterator productIterator = products.createIterator();

        while (productIterator.hasNext()) {
            System.out.println(productIterator.currentItem());
            productIterator.next();
        }

    }
}
