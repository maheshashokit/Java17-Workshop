package com.ashokit.java17.sealedClasses;

public class SealedClassClient {

    public static void handlePayment(PaymentMethod paymentMethod) {
        switch (paymentMethod) {
            case CreditCard creditCard -> creditCard.processPayment(paymentMethod);
            case BankTransfer bankTransfer -> bankTransfer.processPayment(paymentMethod);
            case OnlineWallet onlineWallet -> onlineWallet.processPayment(paymentMethod);
        }
    }

    public static void main(String[] args) {
            PaymentMethod paymentMethod = new CreditCard();
            handlePayment(paymentMethod);
            paymentMethod = new BankTransfer();
            handlePayment(paymentMethod);
            paymentMethod = new OnlineWallet();
            handlePayment(paymentMethod);
    }
}
