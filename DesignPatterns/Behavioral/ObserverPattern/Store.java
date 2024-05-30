package DesignPatterns.Behavioral.ObserverPattern;

import DesignPatterns.Behavioral.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.Behavioral.ObserverPattern.Observable.StockObservable;
import DesignPatterns.Behavioral.ObserverPattern.Observer.EmailObserver;
import DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iPhoneObservable = new IphoneObservableImpl();

        NotificationObserver observerA = new EmailObserver("abc@xyz.com", iPhoneObservable);
        NotificationObserver observerB = new EmailObserver("abc2@xyz.com", iPhoneObservable);
        NotificationObserver observerC = new EmailObserver("abc3@xyz.com", iPhoneObservable);

        iPhoneObservable.add(observerA);
        iPhoneObservable.add(observerB);
        iPhoneObservable.add(observerC);

        iPhoneObservable.setStockCount(10);
    }
}
