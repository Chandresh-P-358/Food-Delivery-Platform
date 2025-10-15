package Java_Assignment_2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant r = new Restaurant("Pizza Place");
        r.addMenuItem(new MenuItem("Pizza", 200));
        r.addMenuItem(new MenuItem("Burger", 150));
        r.addMenuItem(new MenuItem("Pasta", 180));

        Cart cart = new Cart();
        ORder order = null;
        Delivery delivery = new Delivery();

        while (true) {
            System.out.println("\n1. Show Menu  2. Add to Cart  3. View Cart  4. Place Order  5. Update Delivery  6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                r.showMenu();
            } else if (choice == 2) {
                r.showMenu();
                System.out.print("Enter item number: ");
                int i = sc.nextInt() - 1;
                System.out.print("Enter quantity: ");
                int q = sc.nextInt();
                cart.addItem(r.getMenuItem(i), q);
            } else if (choice == 3) {
                cart.showCart();
            } else if (choice == 4) {
                order = new ORder(cart);
                order.showReceipt();
                order.makePayment();
                order.dispatch();
                order.showReceipt();
            } else if (choice == 5) {
                if (order == null) {
                    System.out.println("No order yet!");
                } else {
                    sc.nextLine(); // consume newline
                    System.out.print("Enter new delivery status (Preparing / Out for Delivery / Delivered): ");
                    String status = sc.nextLine();
                    delivery.updateStatus(status);
                    delivery.showStatus();
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
