package DesignPatterns.Behavioral.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationObserver;

public class IphoneObservableImpl implements StockObservable {

    private List<NotificationObserver> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        if (observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

}
