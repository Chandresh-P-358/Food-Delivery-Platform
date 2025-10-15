package Java_Assignment_2;

public class ORder {
	private Cart cart;
	private String paymentStatus;
	private String deliveryStatus;

	public ORder(Cart cart) {
		this.cart=cart;
		paymentStatus=" Pending ";
		deliveryStatus=" Not Dispatched ";
	}
	public double calculateTotal() {
		double total =  cart.getTotal();
		double tax = total * 0.1;
		double fee = 20;
		return total+tax+fee;
	}
    public void makePayment() {
        paymentStatus = "Paid";
        System.out.println("Payment Successful!");
    }

    public void dispatch() {
        if (paymentStatus.equals("Paid")) {
            deliveryStatus = "Out for Delivery";
        } else {
            System.out.println("Payment not done yet!");
        }
    }
    public void showReceipt() {
        cart.showCart();
        System.out.println("Total (with tax & fee) = $." + calculateTotal());
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println("Delivery Status: " + deliveryStatus);
    }
}
