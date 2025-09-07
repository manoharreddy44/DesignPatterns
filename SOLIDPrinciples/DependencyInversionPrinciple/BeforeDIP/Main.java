package SOLIDPrinciples.DependencyInversionPrinciple.BeforeDIP;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send("Hello, World!");
    }
}

