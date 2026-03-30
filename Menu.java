import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Helper to find items during the ordering process
    public MenuItem getItemByName(String name) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayMenu() {
        if (items.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            System.out.println("--- Current Menu ---");
            for (MenuItem item : items) {
                // Formatting for readability
                System.out.println("- " + item.getName() + ": $" + item.getPrice());
            }
        }
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter("menu.txt")) {
            for (MenuItem item : items) {
                writer.write(item.getName() + "," + item.getPrice() + "\n");
            }
            System.out.println("Menu saved successfully to menu.txt.");
        } catch (Exception e) {
            System.out.println("Error saving menu: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        try {
            File file = new File("menu.txt");
            if (!file.exists()) return;

            Scanner reader = new Scanner(file);
            items.clear(); // Clear existing to avoid duplicates on reload
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.trim().isEmpty()) continue;
                
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    items.add(new MenuItem(name, price));
                }
            }
            reader.close();
            System.out.println("Menu loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error loading menu: " + e.getMessage());
        }
    }
}