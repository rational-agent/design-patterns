package com.rationalagent.designpatterns.observerpattern;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void test() throws InterruptedException {
        var client = new Client();

        client.notifyObserversWithEvents(5);
    }
}
