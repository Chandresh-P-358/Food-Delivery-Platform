package Java_Assignment_2;

import java.util.ArrayList;

public class Restaurant {
	private String name;
	private ArrayList<MenuItem> menu;
	
	public Restaurant(String name){
		this.name=name;
		this.menu=new ArrayList<MenuItem>();
	}
	public String getName() {
		return name;
	}
	public void addMenuItem(MenuItem item) {
		menu.add(item);
	}
	public int getMenuCount() {
		return menu.size();
	}
    public MenuItem getMenuItem(int index) {
        if (index >= 0 && index < menu.size()) {
            return menu.get(index);
        }
        else {
        	return null;
        }
    }
	public void showMenu() {
		System.out.println("\n Menu of "+name);
		for(int i=0;i<menu.size();i++) {
			MenuItem item = menu.get(i);
			System.out.println((i+1)+". "+item.getName()+" - $ "+item.getPrice());
			if(!item.isAvailable()) {
				System.out.print(item.getName()+" (Not Available) ");
			}
			System.out.println();
		}
	}
}
