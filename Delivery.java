package Java_Assignment_2;

public class Delivery {
    private String status;

    public Delivery() {
        status = "Preparing";
    }
    public void updateStatus(String newStatus) {
        status = newStatus;
    }
    public void showStatus() {
        System.out.println("Delivery Status: " + status);
    }
}
