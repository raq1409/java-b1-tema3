public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        setWarrantyMonths(warrantyMonths);
    }

    public Electronic(int id, String name, double price) {
        super(id, name, price);
        setWarrantyMonths(0);
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if(warrantyMonths < 0) {
            System.out.println("Warranty cannot be negative.");
        } else {
            this.warrantyMonths = warrantyMonths;
        }
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public String displayWarranty() {
        return "This product has a warranty of " + warrantyMonths + " months.";
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + ": " + getPrice() + "€ - Warranty: " + warrantyMonths + " months";
    }
}
