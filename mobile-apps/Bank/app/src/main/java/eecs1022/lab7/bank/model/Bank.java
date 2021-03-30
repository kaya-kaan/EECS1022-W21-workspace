package eecs1022.lab7.bank.model;

public class Bank {

    private Client[] clients = new Client[6];
    private int clientNumber = 0;

    private int error = 0;
    private String errorMessage = "";

    public Bank() {

    }

    public void addClient(String clientName, double amount) {
        int clientExists = 0;

        for (int i = 0; i < clientNumber; i++) {
            if (clients[i].getName() == clientName) {
                clientExists = 1;
            }
        }
        if (clientNumber == 6) {
            this.error = 1;
            errorMessage = "Error: Maximum Number of Accounts Reached";
        } else if (amount <= 0) {
            this.error = 1;
            errorMessage = "Error: Non-Positive Initial Balance";
        } else if (clientExists == 1) {
            this.error = 1;
            errorMessage = "Error: Client " + clientName + " already exists";
        } else {
            clients[clientNumber] = new Client(clientName, amount);
            clientNumber++;
        }
    }

    public void deposit(String clientName, double amount) {
        int index = -1;

        for (int i = 0; i < clientNumber; i++) {
            if (clientName == clients[i].getName()) {
                index = i;
            }
        }

        if (index == -1) {
            errorMessage = "Error: To-Account " + clientName + " does not exist";
            this.error = 1;
            // return error;
        } else if (amount <= 0) {
            this.error = 1;
            errorMessage = "Error: Non-Positive Amount";
        } else {
            clients[index].deposit(amount);
        }
    }

    public void withdraw(String clientName, double amount) {
        int index = -1;
        double clientBalance = 0;

        for (int i = 0; i < clientNumber; i++) {
            if (clientName == clients[i].getName()) {
                index = i;
                clientBalance = clients[i].getBalance();
            }
        }

        if (index == -1) {
            errorMessage = "Error: From-Account " + clientName + " does not exist";
            this.error = 1;
        } else if (amount <= 0) {
            this.error = 1;
            errorMessage = "Error: Non-Positive Amount";
        } else if (clientBalance < amount) {
            this.error = 1;
            errorMessage = "Error: Amount too large to withdraw";
        } else {
            clients[index].withdraw(amount);
        }
    }

    public void transfer(String fromName, String toName, double amount) {
        int fromIndex = -1;
        int toIndex = -1;

        double fromBalance = 0;

        for (int i = 0; i < clientNumber; i++) {
            if (fromName == clients[i].getName()) {
                fromIndex = i;
                fromBalance = clients[i].getBalance();
            }
        }

        for (int i = 0; i < clientNumber; i++) {
            if (toName == clients[i].getName()) {
                toIndex = i;
            }
        }

        if (fromIndex == -1 || toIndex == -1) {
            this.error = 1;
            if (fromIndex == -1) {
                errorMessage = "Error: From-Account " + fromName + " does not exist";
            } else {
                errorMessage = "Error: To-Account " + toName + " does not exist";
            }

            // return error;
        }else if(amount <= 0) {
            this.error = 1;
            errorMessage = "Error: Non-Positive Amount";
        }else if(fromBalance < amount) {
            this.error = 1;
            errorMessage = "Error: Amount too large to transfer";
        }else {
            clients[fromIndex].withdraw(amount);
            clients[toIndex].deposit(amount);
        }

    }

    public String getStatus() {
        String status = "";

        if (error == 0) {
            status += "Accounts: {";
            for (int i = 0; i < clientNumber; i++) {
                if (i > 0) {
                    status += ", ";
                }
                status += clients[i].getStatus();
            }
            status += "}";

        } else {
            status = errorMessage;
            this.error = 0;
        }
        return status;
    }

    public String[] getStatement(String clientName) {
        int index = -1;
        String[] statement;

        for (int i = 0; i < clientNumber; i++) {
            if (clientName == clients[i].getName()) {
                index = i;
            }
        }

        if (index == -1) {
            errorMessage = "Error: From-Account " + clientName + " does not exist";
            this.error = 1;
            statement = null;
            return statement;
        } else {
            return clients[index].getStatement();
        }
    }

}
