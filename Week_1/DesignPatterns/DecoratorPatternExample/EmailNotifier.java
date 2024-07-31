/*
3.	Implement Concrete Component:
Create a class EmailNotifier that implements Notifier.
*/
public class EmailNotifier implements Notifier{
    @Override
    public void send(String notification) {
        System.out.println("Sending email "+notification);
    }
}
