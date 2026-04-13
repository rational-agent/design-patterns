package com.rationalagent.designpatterns.iteratorpattern.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}