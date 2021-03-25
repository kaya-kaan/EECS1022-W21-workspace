package model;

public class Shop {

	Customer[] customers = new Customer[100];
	int numOfCustomers = 0;
	
	public void addCustomer(Customer customer) {
		customers[numOfCustomers] = customer;
		numOfCustomers++;
	}
	
	public void pay(String name) {
		for(int i = 0 ; i < numOfCustomers ; i++) {
			if(name == customers[i].getName()) {
				customers[i].setBalance(customers[i].getBalance() - customers[i].getAmountDue());
			}
			customers[i].resetRecords();
		}
	}
	
	//#####SETTERS#####
	
	
	
	
	//#####GETTERS#####
	
	public Customer[] getCustomers() {
		Customer[] customers = new Customer[numOfCustomers];
		for(int i = 0 ; i < numOfCustomers ; i++) {
			customers[i] = this.customers[i];
		}
		return customers;
	}
}
