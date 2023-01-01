package main.java.Bank;

import main.java.ATM.ATM;
import main.java.Accounts.*;
import main.java.CustomExceptions.AccountTypeNotFoundException;
import main.java.CustomExceptions.CustomerNotFoundException;
import main.java.Customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private List<ATM> atms;

    public Bank() {
        customers = new ArrayList<Customer>();
        atms = new ArrayList<ATM>();
    }

    public void createNewCustomer() {}

    public void createCustomerNewAccount(Customer customer, AccountType type) throws AccountTypeNotFoundException, CustomerNotFoundException {
        Account account;

        if (!customers.contains(customer)) {
            throw new CustomerNotFoundException();
        }

        switch(type) {
            case LOAN -> account = new Loan(0.0, 0.0);
            case SAVINGS -> account = new Savings(0.0, 0.0);
            case TRANSACTION -> account = new Transaction();
            default -> throw new AccountTypeNotFoundException(type);
        }

        createAccount(account);
    }

    private void createAccount(Account account) {

    }
}
