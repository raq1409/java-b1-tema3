public class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of " + amount + "€ for account " + email);
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Account: " + email;
    }
    
    @Override
    public double calculateTransactionFee() {
        return 1.5 * amount / 100;
    }
}
