public abstract class FoodItem {
    private String itemName;
    private double price;
    
    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice () {
        return price;
    }
    public abstract void displayItem();
    
}
