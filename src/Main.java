public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Notification myNotification = new Vibro(new Ringtone(new BasicNotify()));
        myNotification.notif2();
    }
}