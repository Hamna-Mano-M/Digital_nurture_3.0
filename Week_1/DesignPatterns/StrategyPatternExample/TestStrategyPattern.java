public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876","Name1","123", "12/24");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.execute(1234.00);

        PaymentStrategy payPalPayment = new PayPalPayment("nam1@gmail.com" , "12345");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.execute(3455.67);

    }
}
