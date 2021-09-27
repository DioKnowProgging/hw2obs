package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable{
    private List<String> events = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();


    public void addEvent(String event) {
        this.events.add(event);
        notifySubscribers();
    }

    public void removeEvent(String event) {
        this.events.remove(event);
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Observer subscriber:subscribers) {
            subscriber.update(this.events);
        }
    }
}
