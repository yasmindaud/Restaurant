import java.util.Scanner;
import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Customer> customerList = new ArrayList<>();

        // Load existing menu items from menu.txt
        menu.loadFromFile();

        boolean running = true;
        while (running) {
            System.out.println("\n=== RESTAURANT MANAGEMENT SYSTEM ===");
            System.out.println("1. Register New Customer");
            System.out.println("2. Validate Customer & Place Order");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String contact = scanner.nextLine();
                    customerList.add(new Customer(name, contact, 0));
                    System.out.println("Registration Successful!");
                    break;

                case "2":
                    System.out.print("Enter Customer Phone Number: ");
                    String searchPhone = scanner.nextLine();
                    Customer currentCust = null;

                    for (Customer c : customerList) {
                        if (c.getContactInfo().equals(searchPhone)) {
                            currentCust = c;
                            break;
                        }
                    }

                    if (currentCust != null) {
                        handleOrder(scanner, menu, currentCust);
                    } else {
                        System.out.println("Customer not found. Please register first.");
                    }
                    break;

                case "3":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        // Save menu changes back to file before closing
        menu.saveToFile();
        scanner.close();
        System.out.println("System closed safely.");
    }

    private static void handleOrder(Scanner sc, Menu menu, Customer customer) {
        System.out.println("\nValidated: " + customer.getName());
        menu.displayMenu();
        
        double billTotal = 0;
        while (true) {
            System.out.print("Enter Item Name to order (or 'done' to finish): ");
            String input = sc.nextLine();
            
            if (input.equalsIgnoreCase("done")) break;

            MenuItem item = menu.getItemByName(input);
            if (item != null) {
                billTotal += item.getPrice();
                System.out.println("Added " + item.getName() + " (kshb5=" + item.getPrice() + ")");
            } else {
                System.out.println("Item not found in menu.");
            }
        }

        if (billTotal > 0) {
            customer.addSpending(billTotal); // Uses the method from updated Customer.java
            System.out.println("\n--- FINAL RECEIPT ---");
            customer.showDetails();
            System.out.println("Current Order Total: ksh" + billTotal);
        }
    }
}