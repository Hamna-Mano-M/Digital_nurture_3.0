/*
5.	Test the Decorator Implementation:
Create a test class to demonstrate sending notifications via multiple channels using decorators.

 */
public class Main {
    public static void main(String[] args) {
        //Decorator Pattern:
        //Allows adding new behaviors or functionalities to an object dynamically by wrapping it with one or more decorator objects.
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello Email");

        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello Email and SMS");

        System.out.println();

        Notifier slackSMSAndEmail = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        slackSMSAndEmail.send("Hello Email, SMS and Slack");
    }
}
