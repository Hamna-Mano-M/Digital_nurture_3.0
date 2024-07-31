/*
4.	Implement the Adapter Class:
Create an adapter class for each payment gateway that implements PaymentProcessor and translates the calls to the gateway-specific methods.

 */
public class GPayAdapter implements PaymentProcessor{
    private GPay gPay;

    public GPayAdapter(GPay gPay){
        this.gPay = gPay;
    }

    @Override
    public void processPayment(int amount) {
        gPay.getPaid(amount);
    }
}
