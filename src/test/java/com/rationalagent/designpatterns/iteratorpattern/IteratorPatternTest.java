package com.rationalagent.designpatterns.iteratorpattern;

import com.rationalagent.designpatterns.iteratorpattern.aggregate.ItemAggregate;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class IteratorPatternTest {

    @Test
    void test() {
        var items = new ArrayList<Item>();
        items.add(new Item(1, "item_1"));
        items.add(new Item(2, "item_2"));
        items.add(new Item(3, "item_3"));

        var aggregate = new ItemAggregate(items);
        var iterator = aggregate.createIterator();

        System.out.println("Start iterating");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());

        }
        System.out.println("Done");

    }
}
