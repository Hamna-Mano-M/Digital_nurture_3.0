/*
5.	Test the Adapter Implementation:
Create a test class to demonstrate the use of different payment gateways through the adapter.

 */
public class TestAdapterPattern {
    /*
    The Adapter pattern is used to Allow incompatible interfaces of different classes to work together by wrapping one class with another.
     */
    public static void main(String[] args) {
        GPay gPay = new GPay();
        PaymentProcessor GpayAdapter = new GPayAdapter(gPay);
        GpayAdapter.processPayment(100);

        payTM PayTM = new payTM();
        PaymentProcessor PayTMAdapter = new PayTMAdapter(PayTM);
        PayTMAdapter.processPayment(2500);

    }
}
