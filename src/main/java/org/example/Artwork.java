package org.example;

public class Artwork {
    private String title;
    private String artist;
    private double price;

    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }
//getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }



//    setters

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
