package Java_Assignment_2;

import java.util.*;

public class ORder {
    private int orderId;
    private Cart cart;
    private String paymentStatus;
    private Date orderDate;

    public ORder(int orderId, Cart cart) {
        this.orderId = orderId;
        this.cart = cart;
        this.paymentStatus = "Pending";
        this.orderDate = new Date();
    }

    public void makePayment() {
        paymentStatus = "Paid";
        System.out.println("Payment done successfully!");
    }

    public void showReceipt() {
        System.out.println("\n--- Order Receipt ---");
        System.out.println("Order ID: " + orderId);
        cart.showCart();
        System.out.println("Status: " + paymentStatus);
        System.out.println("Date: " + orderDate);
    }
}
