public class Main { 
    public static void main (String [] args) {
        // Create Manager
         Manager manager = new Manager (
            "Alice",  
               "alice@gmail.com", 
                 101,
               "Manager",  
               30.0, 
               8 
    );
        manager.openRestaurant();
        manager.showDetails();
        System.out.println("-----------------");


        // Create Employee
Employee waiter = new Employee(
    "John",
    "john@email.com",
    102,
    "Waiter",
    15.0,
    6
);
waiter.showDetails();

        // Customer
        Customer customer= new Customer (
            "Yasmin",
            "yas@email.com",
            50
        );
        customer.showDetails();

        //Menu
        Menu menu = new Menu();
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem soda = new MenuItem("Soda", 2.50);

        menu.addItem(burger);
        menu.addItem(soda);

        menu.displayMenu();

        // Order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(soda);

        order.printReceipt();

        
    }
}
