package com.onlinepaymentplatform.model;

public class paypalPayment extends Payment{
    private String email;

    public paypalPayment(double amount, String email) {
        super(amount);
        this.email = email;

    }
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + getAmount() + " for account: " + email);

    }
}
