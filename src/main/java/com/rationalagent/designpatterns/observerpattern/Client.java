package com.rationalagent.designpatterns.observerpattern;

import com.rationalagent.designpatterns.observerpattern.observer.Observer;
import com.rationalagent.designpatterns.observerpattern.observer.Subscriber;
import com.rationalagent.designpatterns.observerpattern.subject.Subject;
import com.rationalagent.designpatterns.observerpattern.subject.SubjectImpl;

public class Client {

    Subject subject = new SubjectImpl();
    Observer sub1 = new Subscriber("sub1");
    Observer sub2 = new Subscriber("sub2");

    Client() {
        subject.addObserver(sub1);
        subject.addObserver(sub2);
    }

    public void notifyObserversWithEvents(int eventCount) throws InterruptedException {
        for (int i = 1; i <= eventCount; i++) {
            subject.notifyObservers("event #" + i + ", at: " + System.currentTimeMillis());
            Thread.sleep(3_000);
        }

    }
}
