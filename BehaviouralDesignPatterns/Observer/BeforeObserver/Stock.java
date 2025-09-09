//The Observer Pattern defines a one-to-many dependency between objects so that when one object (the subject) changes state, all its dependent objects (observers) are notified automatically.


package BehaviouralDesignPatterns.Observer.BeforeObserver;

class Stock {
    private double price;

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Stock price updated: " + price);
        // ❌ But how do we notify multiple apps?
    }
}

