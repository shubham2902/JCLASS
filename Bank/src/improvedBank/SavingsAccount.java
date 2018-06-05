package improvedBank;

public class SavingsAccount extends Account {

    public SavingsAccount(String own, int cash) {
        this.accountType = "Savings Account";
        this.owner = own;
        this.balance = cash;
        System.out.println("Savings account created.");
        return;
    }

}