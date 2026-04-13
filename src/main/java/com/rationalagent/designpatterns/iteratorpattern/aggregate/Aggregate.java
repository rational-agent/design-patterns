package com.rationalagent.designpatterns.iteratorpattern.aggregate;

import com.rationalagent.designpatterns.iteratorpattern.iterator.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
