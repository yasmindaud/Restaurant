import java.util.ArrayList;
public class Menu {
    private ArrayList<MenuItem> items;
    public Menu() {
        items= new ArrayList<>();
    }
    public void addItem(MenuItem item){
        items.add(item);
    }
    public void displayMenu() {
        System.out.println("-----MENU-----");
        for (MenuItem item : items){
            item.displayItem();
        }
        System.out.println("-------------------");
    }

    
}
