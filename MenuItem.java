package Java_Assignment_2;

public class MenuItem {
    private String name;
    private double price;
    private boolean available;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.available = true;
        this.category = category;
    }

    public String getName() { 
    	return name; 
    	}
    public double getPrice() { 
    	return price; 
    	}
    public boolean isAvailable() {
    	return available; 
    	}
    public String getCategory() { 
    	return category; 
    	}
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
