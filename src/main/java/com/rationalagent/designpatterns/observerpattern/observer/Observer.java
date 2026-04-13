package com.rationalagent.designpatterns.observerpattern.observer;

public interface Observer {
    void notify(String event);
    String name();
}
