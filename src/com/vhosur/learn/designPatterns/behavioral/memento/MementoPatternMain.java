package com.vhosur.learn.designPatterns.behavioral.memento;

public class MementoPatternMain {
    public static void main(String[] args) {
        Document document = new Document("content", "Ariel", 10);
        DocumentHistory documentHistory= new DocumentHistory();

        DocumentState initialState = document.createMemento();
        System.out.println(document);

        document.setContent("New Content");
        DocumentState newState = document.createMemento();

        System.out.println(document);

        document.setFontSize(11);
        DocumentState newerState = document.createMemento();

        document.restore(initialState);
        System.out.println(document);
    }
}
