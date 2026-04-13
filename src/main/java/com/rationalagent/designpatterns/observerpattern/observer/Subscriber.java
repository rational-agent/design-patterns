package com.rationalagent.designpatterns.observerpattern.observer;

public record Subscriber(String name) implements Observer {

    @Override
    public void notify(String message) {
        System.out.println(name + " notified with message: " + message);
    }
}
