package model;

public class Client {

		private Account[] accounts; /* number of accounts */ 
		private int noa;

		public Client() { 
			accounts = new Account [5];

		}

		public void addAccount(Account acc) { 
			accounts [noa] =acc;

		noa ++;

		}

		public Account[] getAccounts() {

		return accounts;

		}

		
}
