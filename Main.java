import java.util.Scanner;
public class Main { 
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        try {
            System.out.println("Welcome to the Restaurant Management System ");

            menu.loadFromFile();
            System.out.println("Enter customer name:");
            String name = scanner.nextLine();

            System.out.println("Enter customer contact:");
            String contact = scanner.nextLine();


            Customer customer = new Customer (name, contact, 0);
            customer.showDetails();

            System.out.println("         ");

            System.out.println(" Enter food item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();

            MenuItem item = new MenuItem(itemName, price);

            
            menu.addItem(item);

            System.out.println("\n Restaurant Menu ");
            menu.displayMenu();

            
            Order order = new Order();
            order.addItem(item);

            System.out.println("\n  Order Receipt ");
            order.printReceipt();

            menu.saveToFile();
        }
        
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter correct data.");
        }
        finally {
            scanner.close();
            System.out.println("\nSystem closed safely.");
        }
    }
}

