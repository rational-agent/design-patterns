package com.rationalagent.designpatterns.observerpattern.subject;

import com.rationalagent.designpatterns.observerpattern.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Added observer: " + observer.name());
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Removed observer: " + observer.name());
    }

    @Override
    public void notifyObservers(String message) {
        for (var observer : observers) {
            observer.notify(message);
        }
    }
}