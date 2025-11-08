package Java_Assignment_2;

public class CartItem {
    private MenuItem item;
    private int quantity;
    private double subtotal;
    private String specialNote;

    public CartItem(MenuItem item, int quantity, String specialNote) {
        this.item = item;
        this.quantity = quantity;
        this.specialNote = specialNote;
        this.subtotal = item.getPrice() * quantity;
    }

    public double getSubtotal() { return subtotal; }

    public void showItem() {
        System.out.println(item.getName() + " x" + quantity + " = ₹" + subtotal);
    }
}
