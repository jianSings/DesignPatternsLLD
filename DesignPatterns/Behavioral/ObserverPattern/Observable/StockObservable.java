package DesignPatterns.Behavioral.ObserverPattern.Observable;

import DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
