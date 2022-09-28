package com.hosny.dip;

public class CreditCard implements Cards{

    public void doTransaction(Double amount){
        System.out.println("Payment via Credit card");
    }
}
