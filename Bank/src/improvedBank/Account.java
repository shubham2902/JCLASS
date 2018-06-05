package improvedBank;

public abstract class Account {

    public String accountType;
    public String owner;
    public int balance;

    public int deposit(int amount) {
        return balance += amount;
    }

    public int withdraw(int amount) {
        return balance -= amount;
    }

    public String toString() {
        return "Account Type: " + this.accountType + " | Account owner: " + this.owner + " | Account balance: $" + this.balance;
    }   
}