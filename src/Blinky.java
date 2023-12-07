public class Blinky extends NotificationDecorator{
    public Blinky(Notification n) {
        super(n);
    }

    @Override
    public void notif2(){
        super.notif2();
        System.out.print("Blink");
    }
}
