package com.rationalagent.designpatterns.observerpattern.subject;

import com.rationalagent.designpatterns.observerpattern.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}