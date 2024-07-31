public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier wrapped){
        super(wrapped);
    }
    @Override
    public void send(String notification){
        super.send(notification);
        sendSlack(notification);
    }
    private void sendSlack(String notification){
        System.out.println("Sending slack "+ notification);
    }
}
