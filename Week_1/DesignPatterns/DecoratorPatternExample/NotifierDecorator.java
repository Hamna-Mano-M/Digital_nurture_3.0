/*
4.	Implement Decorator Classes:
Create abstract decorator class NotifierDecorator that implements Notifier and holds a reference to a Notifier object.
Create concrete decorator classes like SMSNotifierDecorator, SlackNotifierDecorator that extend NotifierDecorator.

 */
public abstract class NotifierDecorator implements Notifier{
    protected Notifier wrapped;

    public NotifierDecorator(Notifier wrapped){
        this.wrapped = wrapped;
    }
    public void send(String Notification){
        wrapped.send(Notification);
    }
}
