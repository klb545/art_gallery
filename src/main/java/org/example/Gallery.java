package org.example;

import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;


    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

    //getters

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    //setters


    public void setName(String newName) {
        this.name = newName;
    }

    //    custom methods
    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void sellArtwork(Artwork artwork){
        this.stock.remove(artwork);
        this.till += artwork.getPrice();
    }


}
