package com.ashokit.java17.sealedClasses;

public final class BankTransfer extends PaymentMethod {

    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("BankTransfer PaymentMethod Implementation......");
    }
}