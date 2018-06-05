package improvedBank;


public class CheckingAccount extends Account {

    public CheckingAccount(String own, int cash) {
        this.accountType = "Checking Account";
        this.owner = own;
        this.balance = cash;
        System.out.println("Checking account created");
        return;
    }
}