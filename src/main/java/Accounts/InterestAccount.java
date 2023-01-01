package main.java.Accounts;

public abstract class InterestAccount extends Account {
    private double interestRate;

    public InterestAccount(double balance, double interestRate) {
        this.setBalance(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        }
    }

}
