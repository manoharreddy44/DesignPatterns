package SOLIDPrinciples.DependencyInversionPrinciple.BeforeDIP;

class Notification {
    private EmailService emailService = new EmailService();

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
