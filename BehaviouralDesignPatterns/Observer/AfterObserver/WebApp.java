package BehaviouralDesignPatterns.Observer.AfterObserver;

class WebApp implements Observer {
    public void update(double price) {
        System.out.println("WebApp: Stock price updated to " + price);
    }
}
