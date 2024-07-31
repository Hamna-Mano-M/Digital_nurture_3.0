public class CreditCardPayment implements PaymentStrategy {
    private String cardNo;
    private String cardHolderName;
    private String cvv;
    private String expiry;

    public CreditCardPayment(String cardNo , String cardHolderName , String cvv , String expiry){
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    @Override
    public void pay(double amount){
        System.out.println("PAID "+amount+" USING CREDIT CARD");
    }


}
