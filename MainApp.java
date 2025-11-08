package Java_Assignment_2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant r = new Restaurant("Pizza Palace", "Downtown", 4.5);
        r.addMenuItem(new MenuItem("Pizza", 200, "Main"));
        r.addMenuItem(new MenuItem("Burger", 150, "Snack"));
        r.addMenuItem(new MenuItem("Pasta", 180, "Main"));
        r.addMenuItem(new MenuItem("Coke", 50, "Drink"));

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();

        Customer c = new Customer(name, email, phone, address);
        Cart cart = new Cart(1, c);
        ORder order = null;
        Delivery delivery = new Delivery(1001, "Ravi");

        while (true) {
            System.out.println("\n1. Show Menu  2. Add to Cart  3. View Cart  4. Place Order  5. Update Delivery  6. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                r.showMenu();
            } else if (ch == 2) {
                r.showMenu();
                System.out.print("Enter item number: ");
                int i = sc.nextInt() - 1;
                System.out.print("Enter quantity: ");
                int q = sc.nextInt();
                sc.nextLine();
                System.out.print("Special note: ");
                String note = sc.nextLine();
                cart.addItem(r.getMenuItem(i), q, note);
            } else if (ch == 3) {
                cart.showCart();
            } else if (ch == 4) {
                order = new ORder(1000, cart);
                order.showReceipt();
                order.makePayment();
                order.showReceipt();
            } else if (ch == 5) {
                if (order == null) {
                    System.out.println("No order yet!");
                } else {
                    System.out.print("Enter new delivery status: ");
                    String status = sc.nextLine();
                    delivery.updateStatus(status);
                    delivery.showStatus();
                }
            } else if (ch == 6) {
                System.out.println("Exiting... Thank you!");
                break;
            }
        }

        sc.close();
    }
}
