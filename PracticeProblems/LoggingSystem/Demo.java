package PracticeProblems.LoggingSystem;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- General Logger (Default Config) ---");
        Logger generalLogger = LoggerFactory.getInstance().getLogger("General");
        generalLogger.info("Application is starting.");
        generalLogger.debug("This is a debug message that should NOT appear.");
        generalLogger.error("This is an error message.");

        System.out.println("\n--- Payment Logger (Custom Config) ---");
        Logger paymentLogger = LoggerFactory.getInstance().getLogger("PaymentService");

        paymentLogger.setLevel(LogLevel.DEBUG);
        paymentLogger.setFormatter(new SimpleFormatter());
        paymentLogger.addAppender(new FileAppender("payment_logs.log"));
        
        paymentLogger.info("Processing payment for user 456.");
        paymentLogger.debug("Payment details validated.");
        paymentLogger.warn("Credit card is about to expire.");
        paymentLogger.error("Payment failed: Insufficient funds.");

        System.out.println("\nPayment logs have been written to payment_logs.log");
    }
}
