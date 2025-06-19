public class SlackNotifierDecorator extends NotifierDecorator{
    protected Notifier notify;
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message);
        System.out.println("Slack Message sent: "+message);
    }
}
