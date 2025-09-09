package BehaviouralDesignPatterns.Observer.AfterObserver;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stock.addObserver(mobile);
        stock.addObserver(web);

        stock.setPrice(100.5);
        stock.setPrice(105.0);
    }
}

