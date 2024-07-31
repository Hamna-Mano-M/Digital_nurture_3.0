public class PayTMAdapter implements PaymentProcessor{
    private payTM PayTM;

    public PayTMAdapter(payTM PayTM){
        this.PayTM = PayTM;
    }

    @Override
    public void processPayment(int amount) {
        PayTM.transfer(amount);

    }
}
