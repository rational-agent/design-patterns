package com.rationalagent.designpatterns.iteratorpattern.aggregate;

import com.rationalagent.designpatterns.iteratorpattern.Item;
import com.rationalagent.designpatterns.iteratorpattern.iterator.ItemIterator;
import com.rationalagent.designpatterns.iteratorpattern.iterator.Iterator;
import java.util.List;

public class ItemAggregate implements Aggregate<Item> {
    private final List<Item> items;

    public ItemAggregate(List<Item> list) {
        this.items = list;
    }

    @Override
    public Iterator<Item> createIterator() {
        return new ItemIterator(items);
    }
}
