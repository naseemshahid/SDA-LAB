package Indirection.withoutPrinciple;



class EmailService {
    void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

public class MessageSender {
    private EmailService emailService;

    public MessageSender() {
        this.emailService = new EmailService();
    }

    public void send(String message) {
        emailService.sendMessage(message);
    }

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.send("Hello, this is an email!");
    }
}

