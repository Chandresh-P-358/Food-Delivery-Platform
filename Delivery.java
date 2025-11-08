package Java_Assignment_2;

public class Delivery {
    private int deliveryId;
    private String deliveryPerson;
    private String status;
    private String estimatedTime;

    public Delivery(int id, String person) {
        this.deliveryId = id;
        this.deliveryPerson = person;
        this.status = "Preparing";
        this.estimatedTime = "30 minutes";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void showStatus() {
        System.out.println("Delivery #" + deliveryId + " - " + status + " (ETA: " + estimatedTime + ")");
    }
}
