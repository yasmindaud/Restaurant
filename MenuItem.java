public class MenuItem {

    private String name;
    private double price;

    public MenuItem(String itemName, double price) {
        this.name = itemName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public void displayItem() {
        System.out.println(getName() + "-$" + getPrice());
    }
}