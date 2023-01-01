package main.java.Accounts;

public class Loan extends InterestAccount {
    public Loan(double balance, double interestRate) {
        super((balance + (balance * interestRate)), interestRate);
    }

    @Override
    public boolean deposit(double amount) {
        if (amount >= 0) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            return true;
        }
        return false;
    }
}
