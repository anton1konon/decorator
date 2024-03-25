package notification;

public class TestClient {

    public static void main(String[] args) {

        // створюємо нотіфай стек для Анни, яка отримує повідомлення тільки через емейл
        Notification annaNotifyStack = new Notifier();
        annaNotifyStack.sendMessage("Hello, Anna");

        System.out.println();

        // створюємо нотіфай стек для Антона, яка отримує повідомлення через емейл та смс
        Notification antonNotifyStack = new Notifier();
        antonNotifyStack = new SMSNotificationDecorator(antonNotifyStack);
        antonNotifyStack.sendMessage("Hello, Anton");

        System.out.println();

        // створюємо нотіфай стек для Саші, який отримує повідомлення через емейл, смс та тг
        Notification sashaNotifyStack = new Notifier();
        sashaNotifyStack = new SMSNotificationDecorator(sashaNotifyStack);
        sashaNotifyStack = new TelegramNotificationDecorator(sashaNotifyStack);
        sashaNotifyStack.sendMessage("Hello, Sasha");
    }

}
