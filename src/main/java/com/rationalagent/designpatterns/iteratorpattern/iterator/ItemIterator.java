package com.rationalagent.designpatterns.iteratorpattern.iterator;

import com.rationalagent.designpatterns.iteratorpattern.Item;
import java.util.List;
import java.util.NoSuchElementException;

public class ItemIterator implements Iterator<Item> {
    private int currentIndex = 0;
    private final List<Item> items;

    public ItemIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return items.get(currentIndex++);
    }
}