package com.hosny.dip;

public class DebitCard implements Cards {

    public void doTransaction(Double amount){
        System.out.println("Payment via Debit card");
    }
}
