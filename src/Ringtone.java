public class Ringtone extends NotificationDecorator{
    public Ringtone(Notification n) {
        super(n);
    }

    @Override
    public void notif2(){
        super.notif2();
        System.out.print("Kling Kling");
    }
}
