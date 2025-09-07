package SOLIDPrinciples.DependencyInversionPrinciple.AfterDIP;

public class Main {
    public static void main(String[] args) {
        // Inject Email service
        Notification emailNotification = new Notification(new EmailService());
        emailNotification.send("Hello via Email!");

        // Inject SMS service
        Notification smsNotification = new Notification(new SMSService());
        smsNotification.send("Hello via SMS!");
    }
}
