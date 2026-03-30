import java.util.ArrayList;
public class Order implements Payable {
    private static String restaurantName ="Yasmin's Bistro";
    private ArrayList<MenuItem> orderedItems;
    public Order(){
        orderedItems = new ArrayList<>();
    }
    public void addItem( MenuItem item){
        orderedItems.add(item);
    }
    @Override
    public double calculatePayment() {
        double total =0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }
    public void printReceipt() {
        System.out.println("Restaurant:" + restaurantName);
        System.out.println("Total Bill: ksh"  + calculatePayment());
        System.out.println( "========================");

    }

    
}
