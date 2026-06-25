class SendNotification {
    public static void main(String[] args) {
        Notification n1 = new Email("Rishabh","Hey There");
        n1.sendNotification();
        Notification n2 = new Sms("Rishabh Pathak","This is SMS");
        n2.sendNotification();
        Notification n3 = new Push("Rishabh","Notification is from Push");
        n3.sendNotification();
    }
}
class Notification {
    String recipientName;
    String message;
    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }
    void sendNotification() {
        
    }
}
class Email extends Notification {
    Email(String recipientName, String message) {
        super(recipientName,message);
    }
    @Override
    void sendNotification() {
        System.out.println("Message from Email\nRecipient Name: " + recipientName + "\nMessage: " + message);
    }
}
class Sms extends Notification {
    Sms(String recipientName, String message) {
        super(recipientName,message);
    }
    @Override
    void sendNotification() {
        System.out.println("Message from SMS\nRecipient Name: " + recipientName + "\nMessage: " + message);
    }
}
class Push extends Notification {
    Push(String recipientName, String message) {
        super(recipientName,message);
    }
    @Override
    void sendNotification() {
        System.out.println("Message from Push\nRecipient Name: " + recipientName + "\nMessage: " + message);
    }
}