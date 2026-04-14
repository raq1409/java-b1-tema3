public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of " + amount + "€ using card " + cardNumber);
    }

    @Override
    public String getPaymentDetails() {
        return "Card Number: " + cardNumber;
    }

    @Override
    public double calculateTransactionFee() {
        return 2 * amount / 100;      
    }
}
