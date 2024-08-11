package com.ashokit.java17.sealedClasses;

public final class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("CreditCard PaymentMethod Implementation......");
    }
}