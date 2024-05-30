package DesignPatterns.Behavioral.ObserverPattern.Observer;

import DesignPatterns.Behavioral.ObserverPattern.Observable.StockObservable;

public class EmailObserver implements NotificationObserver {

    private String email;
    private StockObservable stockObservable;

    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        this.sendEmail(email, "product available");
    }

    private void sendEmail(String email, String message) {
        System.out.println("Email send to: " + email + " with a message: " + message);
    }

}
