package model;

public class Customer {

	
	String name;
	double balance;
	Record[] records = new Record[30];
	int numOfRecords = 0;
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name, double balance) {
	this.name = name;
	this.balance = balance;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public void addRecord(Record record) {
		records[numOfRecords] = record;
		numOfRecords++;
	}
	
	public void addRecord(String name, double price, int quantity) {
		records[numOfRecords] = new Record(name, price, quantity);
		numOfRecords++;
	}
	
	public void addRecords(Record[] records) {
		for(int i = 0 ; i < records.length ; i++) {
			this.records[numOfRecords] = records[i];
			numOfRecords++;
		}
	}
	
	public void resetRecords() {
		this.records = new Record[30];
		numOfRecords = 0;
	}
	
	//#####SETTERS#####
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//#####GETTERS#####

	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Record[] getRecords() {
		Record[] records = new Record[numOfRecords];
		for(int i = 0 ; i < numOfRecords ; i++) {
			records[i] = this.records[i];
		}
		return records;
	}
	public double getAmountDue() {
		double amount = 0.0;
		for(int i = 0 ; i < numOfRecords ; i++) {
			amount += records[i].getPrice() * records[i].getQuantity();
		}
		return amount;
	}
	
	public Record[] getRecordsLargerThan(double limit) {
		Record[] recordsLargerThan;
		double amount = 0;
		int count = 0;
		
		for(int i = 0 ; i < numOfRecords ; i++) {
			 amount = records[i].getPrice() * records[i].getQuantity();
			if (amount > limit ) {
				count++;
			}
		}
		
		recordsLargerThan = new Record[count];
		count = 0;
		
		for(int i = 0 ; i < numOfRecords ; i++) {
			 amount = records[i].getPrice() * records[i].getQuantity();
			if (amount > limit ) {
				recordsLargerThan[count] = records[i];
				count++;
			}
		}
		
		return recordsLargerThan;
	}
	
	
}
