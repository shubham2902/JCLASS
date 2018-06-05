package improvedBank;
import java.util.*;

public class Bank {

    public static List<Account> bankAccounts = new ArrayList<Account>();

    public List<Account> addAcc(Account acc) {
        bankAccounts.add(acc);
        return bankAccounts;
    }

    // testing code, not sure how to implement user control yet :/
    public static void main(String[] args) {
        Bank myBank = new Bank();

        CheckingAccount checkingAccount = new CheckingAccount("Sam's checking", 372);
        SavingsAccount savingAccount = new SavingsAccount("Sam's saving", 72);

        myBank.addAcc(checkingAccount);
        myBank.addAcc(savingAccount);

        checkingAccount.deposit(37);
        System.out.println(bankAccounts);

        savingAccount.deposit(12);
        System.out.println("");
        checkingAccount.withdraw(4);
        System.out.println(bankAccounts);
    }
}