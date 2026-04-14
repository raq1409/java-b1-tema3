public class BankTransfer extends Payment {
    private String iban;

    public BankTransfer(double amount, String iban) {
        super(amount);
        this.iban = iban;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer of " + amount + "€ to IBAN " + iban);
    }

    @Override
    public String getPaymentDetails() {
       return "Bank Transfer to IBAN: " + iban;
    }

    @Override
    public double calculateTransactionFee() {
       return 3.5;
    }
    
}
