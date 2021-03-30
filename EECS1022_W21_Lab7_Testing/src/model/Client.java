package model;

public class Client {

    private String name;
    private double balance;
    private Transaction[] transactions = new Transaction[10];
    private int numOfTransactions = 0;

    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amountToDeposit) {
        if (numOfTransactions > 10) {

        } else {
            balance += amountToDeposit;
            transactions[numOfTransactions] = new Transaction("DEPOSIT", amountToDeposit);
            numOfTransactions++;
        }
    }

    public void withdraw(double amountToWithdraw) {
        if (numOfTransactions > 10) {

        } else {
            balance -= amountToWithdraw;
            transactions[numOfTransactions] = new Transaction("WITHDRAW", amountToWithdraw);
            numOfTransactions++;
        }
    }

    public double getBalance() {
    	return this.balance;
    }
    
    public String getStatus() {
        String status = "";
        String balance = String.format("%.2f", this.balance);
        status += this.name + ": $" + balance;
        return status;
    }

    public String[] getStatement() {
        String[] statement = new String[(numOfTransactions + 1)];
        statement[0] = getStatus();
        for (int i = 1 ; i < statement.length ; i++) {
            statement[i] = transactions[i - 1].getStatus();
        }
        return statement;
    }

    public String getName() {
        return this.name;
    }
}
