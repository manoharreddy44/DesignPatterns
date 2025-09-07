package SOLIDPrinciples.DependencyInversionPrinciple.AfterDIP;

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
