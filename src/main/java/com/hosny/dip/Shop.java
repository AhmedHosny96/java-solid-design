package com.hosny.dip;

public class Shop {


    private DebitCard debitCard;

    private Cards cards;


    public Shop( Cards cards) {
        this.cards = cards;
    }

    public void purchase(Double amount){
        debitCard.doTransaction(amount);
    }



    public static void main(String[] args) {

        Cards card = new CreditCard();
        Shop shop = new Shop(card);
        shop.purchase(4500.0);

    }
}
