package Indirection.withPrinciple;



interface MessageService {
    void sendMessage(String message);
}


class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


public class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }

    public static void main(String[] args) {
        MessageSender emailSender = new MessageSender(new EmailService());
        emailSender.send("Hello via Email!");

        MessageSender smsSender = new MessageSender(new SMSService());
        smsSender.send("Hello via SMS!");
    }
}

