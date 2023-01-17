abstract class Message {
    abstract void send();
}

class EmailMessage extends Message {
    private String recipientEmail;
    private String messageData;

    @Override
    void send() {
        System.out.println("EmailMessage send");
    }
}

class SMSMessage extends Message {
    private String message;
    private String phoneNumber;

    @Override
    void send() {
        System.out.println("SMSMessage send");
    }
}

class GPMessage extends Message {
    private String message;
    private String phoneNumber;

    @Override
    void send() {
        System.out.println("GPMessage send");
    }
}

public class NotificationManager {
    //Dependency inversion
    public void sendNotification(Message message) {
        message.send();
    }
}