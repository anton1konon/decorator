package notification;

// базовий клас декораторів
public abstract class BaseNotificationDecorator implements Notification {

    // поле яке вказує на вкладений об’єкт-компонент
    private final Notification wrapper;

    public BaseNotificationDecorator(Notification wrapper) {
        this.wrapper = wrapper;
    }

    // усі методи базового декоратора повинні делегувати роботу вкладеному об’єкту
    @Override
    public void sendMessage(String msg) {
        wrapper.sendMessage(msg);
    }
}

