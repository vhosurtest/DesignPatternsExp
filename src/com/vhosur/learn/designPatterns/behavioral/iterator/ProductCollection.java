package com.vhosur.learn.designPatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public ProductIterator createIterator() {
        return new ProductListIterator(this.products);
    }

    private class ProductListIterator implements ProductIterator{
        private List<Product> products;
        private int index;

        private ProductListIterator(List<Product> products) {
            this.products = products;
        }

        @Override
        public boolean hasNext() {
            return (index < products.size());
        }

        @Override
        public Product currentItem() {
            return products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
