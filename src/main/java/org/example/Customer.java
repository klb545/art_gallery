package org.example;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;


    public Customer (String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }



    //setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setWallet(double newWallet) {
        this.wallet = newWallet;
    }

    //    custom method
    public void buyArtwork(Artwork artwork, Gallery temporaryVariable){
        this.wallet -= artwork.getPrice();

    // do method in Gallery 'sellArtwork'
        temporaryVariable.sellArtwork(artwork);
    }


}
