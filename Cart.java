package Java_Assignment_2;

import java.util.ArrayList;

public class Cart {
	private ArrayList<CartItem> items;
	
	public Cart() {
		items= new ArrayList<CartItem>();
	}
	public void addItem(MenuItem item,int Quantity) {
		if(item.isAvailable()) {
			items.add(new CartItem(item,Quantity));
			System.out.println(Quantity+" X "+item.getName()+" added to the cart");
		}
		else {
			System.out.println(item.getName() + " is not available.");
		}
	}
	public void showCart() {
		if(items.isEmpty()) {
			System.out.println("Cart is Empty");
		}
		else {
			System.out.println("Items Are in the Cart");
			for (CartItem cartItem : items) {
			    MenuItem item = cartItem.getItem();
			    System.out.println(cartItem.getQuantity() + " x " + item.getName() + " - $" + item.getPrice());
			}

		}
	}
	public double getTotal() {
		double total =0;
		for (CartItem cartItem : items) {
		    total += cartItem.getItem().getPrice() * cartItem.getQuantity();
		}
		return total;
	}
}
