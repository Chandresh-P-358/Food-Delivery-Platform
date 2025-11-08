package Java_Assignment_2;

import java.util.*;

public class Cart {
    private int cartId;
    private Customer customer;
    private ArrayList<CartItem> items;
    private double totalAmount;

    public Cart(int cartId, Customer customer) {
        this.cartId = cartId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addItem(MenuItem item, int quantity, String note) {
        CartItem ci = new CartItem(item, quantity, note);
        items.add(ci);
        totalAmount += ci.getSubtotal();
    }

    public void showCart() {
        System.out.println("\n--- " + customer.getName() + "'s Cart ---");
        for (CartItem c : items) {
            c.showItem();
        }
        System.out.println("Total: ₹" + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
