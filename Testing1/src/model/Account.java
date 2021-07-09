package model;

public class Account {
	 private Client owner;

	public Account() {

	owner= null;

	}

	public void changeOwner(Client client) {

	owner = client;

	}

	public Client getOwner() { 
		return owner;

	}

	

}
