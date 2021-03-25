package model;

public class Record {
	
	String item; 
	double price;
	int quantity;
	
	public Record() {
		price = 0;
		quantity = 0;
		
	}
	public Record(String name, double price, int quantity) {
		item = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//#####SETTERS#####
	
	public void setItem(String name) {
		item = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//#####GETTERS#####

	public String getItem() {
		return item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
