package com.company;

public interface Observable {
    void subscribe(Observer subscriber);
    void unsubscribe(Observer subscriber);
    void notifySubscribers();
}
