package BehaviouralDesignPatterns.Observer.AfterObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  private List<Observer> observers = new ArrayList<>();
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(price);
        }
    }
}
