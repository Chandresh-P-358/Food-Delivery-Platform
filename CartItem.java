package Java_Assignment_2;

public class CartItem {
	private MenuItem item;
    private int quantity;

    public CartItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
