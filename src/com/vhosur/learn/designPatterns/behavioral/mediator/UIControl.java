package com.vhosur.learn.designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    protected List<Observer> observers = new ArrayList<Observer>();

    protected void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    protected void notifyObservers() {
        for(var observer: observers) {
            observer.update();
        }
    }
}
