public class Vibro extends NotificationDecorator{
    public Vibro(Notification n) {
        super(n);
    }

    @Override
    public void notif2(){
        super.notif2();
        System.out.print("Brrr Brrr");
    }
}
