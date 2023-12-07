public class NotificationDecorator implements Notification{
    protected Notification notification;

    public NotificationDecorator(Notification n){
        this.notification=n;
    }

    @Override
    public void notif2() {
        this.notification.notif2();
    }
}
