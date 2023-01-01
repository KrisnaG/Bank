package main.java.CustomExceptions;

import main.java.Accounts.AccountType;

public class AccountTypeNotFoundException extends Exception {
    public AccountTypeNotFoundException(AccountType type) {
        super("Account type not found: " + type.toString());
    }
}
