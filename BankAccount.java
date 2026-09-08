public class BankAccount {
    private String accountHolder;
    private double balance;

public BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
 }

public void deposit(double amount) {
// TODO: add the amount to the balance
    if (amount < 1){
        System.out.println("Nothing was added to balance.");
        return;
    }
    balance += amount;
}

public boolean withdraw(double amount) {
// TODO:
// Withdraw the requested amount if sufficient funds are available.
// Return true if the withdrawal succeeds.
// Return false otherwise. return false;
    if (amount <= balance && balance - amount >= 50){
        balance = balance - amount -2;
        return true;
    }
    return false;
}

public String getAccountSummary() {

    return accountHolder + ": $" + balance;
}
}