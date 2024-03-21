package notification;

// Клас конкретного компонента
public class Notifier implements Notification{

    // основна логіка - відправляємо повідомлення на емейл
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg + ", message sent in email");
    }

}

