package notification;

public class SMSNotificationDecorator extends BaseNotificationDecorator {

    public SMSNotificationDecorator(Notification wrapper) {
        super(wrapper);
    }

    @Override
    public void sendMessage(String msg) {
        // викликаємо метод вкладеного об'єкта
        super.sendMessage(msg);
        // додаємо функціонал
        sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println(msg + ", message sent in SMS");
    }
}