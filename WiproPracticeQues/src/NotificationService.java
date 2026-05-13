
public class NotificationService {

    public static void main(String[] args) {

        Notification notification;

        notification = NotificationFactory.createNotification("EMAIL");
        notification.send("Hello via Email!");

        notification = NotificationFactory.createNotification("SMS");
        notification.send("Hello via SMS!");

        notification = NotificationFactory.createNotification("PUSH");
        notification.send("Hello via Push Notification!");
    }
}


interface Notification {
    void send(String message);
}


class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}


class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}


class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push Notification Sent: " + message);
    }
}

// Factory Class
class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } 
        else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } 
        else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        return null;
    }
}
