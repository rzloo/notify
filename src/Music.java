public class Music extends NotificationDecorator{
    public Music (Notification n) {
        super(n);
    }

    @Override
    public void notif2(){
        super.notif2();
        System.out.print("Music");
    }
}
