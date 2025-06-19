public class SMSNotifierDecorator extends NotifierDecorator{

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message); // base send (e.g., Email)
        System.out.println("📱 SMS sent: " + message);
    }
}
