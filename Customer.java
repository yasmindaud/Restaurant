public class Customer extends User {
    private int loyaltyPoints;
    public Customer( String name, String contactInfo, int loyaltyPoints) {
     super (name, contactInfo);
     this.loyaltyPoints = loyaltyPoints;
}
public void addPoints (int points){
    this.loyaltyPoints +=points;
}
@Override
public void showDetails(){
    System.out.println("Customer:" + getName());
    System.out.println("Loyalty Points:" + loyaltyPoints);
    System.out.println("-------------------");
}
    
}
