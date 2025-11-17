package com.onlinepaymentplatform.model;

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    // abstract method to enforce subclasses to define their payment process1
    public abstract void processPayment();
}
