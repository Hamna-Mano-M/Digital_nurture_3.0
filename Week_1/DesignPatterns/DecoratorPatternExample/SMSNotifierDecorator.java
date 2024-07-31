public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier wrapped){
        super(wrapped);
    }
    @Override
    public void send(String notification){
        super.send(notification);
        sendSMS(notification);
    }
    private void sendSMS(String notification){
        System.out.println("Sending SMS "+notification);
    }
}
