package SOLIDPrinciples.DependencyInversionPrinciple.AfterDIP;

class Notification {
    private MessageService messageService;

    // Dependency Injection (constructor)
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}

