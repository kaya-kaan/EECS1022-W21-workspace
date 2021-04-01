package eecs1022.lab7.bank.model;

public class Transaction {

    double amount;
    String lastTransactionType;

    public Transaction(String type, double amount){
        lastTransactionType = type;
        this.amount = amount;
    }


    public String getStatus(){
        String status = "";
        String amount = String.format("%.2f", this.amount);
        status = "Transaction " + lastTransactionType + ": $" + amount;
        return status;
    }
}