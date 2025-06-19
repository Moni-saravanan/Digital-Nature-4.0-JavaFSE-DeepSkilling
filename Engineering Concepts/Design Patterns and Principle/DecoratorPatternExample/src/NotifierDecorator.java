public abstract class NotifierDecorator implements Notifier{
    protected Notifier notifiy;
    public NotifierDecorator(Notifier notifier) {
        this.notifiy=notifier;
    }
    @Override
    public void send(String message) {
        notifiy.send(message);
    }
}
