package notification;

public class TelegramNotificationDecorator extends BaseNotificationDecorator {

    public TelegramNotificationDecorator(Notification wrapper) {
        super(wrapper);
    }

    @Override
    public void sendMessage(String msg) {
        // викликаємо метод вкладеного об'єкта
        super.sendMessage(msg);
        // додаємо функціонал
        sendTelegram(msg);
    }

    private void sendTelegram(String msg) {
        System.out.println(msg + ", message sent in Telegram");
    }

}

