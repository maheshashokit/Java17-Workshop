package com.ashokit.java17.sealedClasses;

public final class OnlineWallet extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("OnlineWallet PaymentMethod Implementation......");
    }
}