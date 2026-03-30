public class Customer extends User {
    private int loyaltyPoints;
    private double totalSpent; // Added to track spending

    public Customer(String name, String contactInfo, int loyaltyPoints) {
        super(name, contactInfo);
        this.loyaltyPoints = loyaltyPoints;
        this.totalSpent = 0.0;
    }

    public void addPoints(int points) {
        this.loyaltyPoints += points;
    }

    public void addSpending(double amount) {
        this.totalSpent += amount;
        // Logic: 1 point for every $10 spent
        addPoints((int) (amount / 10));
    }

    @Override
    public void showDetails() {
        System.out.println("Customer: " + getName());
        System.out.println("Contact: " + getContactInfo());
        System.out.println("Loyalty Points: " + loyaltyPoints);
        System.out.println("Total Amount Spent: ksh" + totalSpent);
        System.out.println("-------------------");
    }
}