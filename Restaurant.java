package Java_Assignment_2;

import java.util.*;

public class Restaurant {
    private String name;
    private String address;
    private double rating;
    private ArrayList<MenuItem> menuItems;

    public Restaurant(String name, String address, double rating) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void showMenu() {
        System.out.println("\n--- " + name + " Menu ---");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem m = menuItems.get(i);
            System.out.println((i + 1) + ". " + m.getName() + " - ₹" + m.getPrice() + " (" + m.getCategory() + ")");
        }
    }

    public MenuItem getMenuItem(int index) {
        if (index >= 0 && index < menuItems.size()) {
            return menuItems.get(index);
        }
        return null;
    }
}
