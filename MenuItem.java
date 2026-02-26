public class MenuItem extends FoodItem {
    public MenuItem( String itemName, double price) {
        super(itemName, price);
    }
    @Override
    public void displayItem(){
        System.out.println(getItemName() + "-$" + getPrice());
    }
    
}
