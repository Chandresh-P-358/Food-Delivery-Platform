package Java_Assignment_2;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String name, String email, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() { 
    	return name; 
    	}
}
