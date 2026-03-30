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

    public void displayMenu() {
        if (items.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            for (MenuItem item : items) {
                System.out.println(item.getName() + "_" + item.getPrice() + "\n");
            }
        }
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("menu.txt");
            for (MenuItem item : items) {
                writer.write(item.getName() + "," + item.getPrice() + "\n");
            }
            writer.close();
            System.out.println("Menu saved to file.");
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }

    public void loadFromFile() {
        try {
            File file = new File("menu.txt");
            if (!file.exists()) {
                return;
            }
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                items.add(new MenuItem(name, price));
            }
            reader.close();
            System.out.println("Menu loaded from file.");
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}