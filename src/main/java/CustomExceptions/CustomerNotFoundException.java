package main.java.CustomExceptions;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException() {
        super("Customer is not a customer of the Bank: ");
    }
}
