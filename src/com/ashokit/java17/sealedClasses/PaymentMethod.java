package com.ashokit.java17.sealedClasses;

public abstract sealed class PaymentMethod permits CreditCard, BankTransfer, OnlineWallet {

    public abstract void processPayment(PaymentMethod payment);

}