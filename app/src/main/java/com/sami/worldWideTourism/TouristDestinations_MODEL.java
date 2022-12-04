package com.sami.worldWideTourism;

public class TouristDestinations_MODEL {
    int image;
    String name, country;

    public TouristDestinations_MODEL(int image, String name, String country) {
        this.image = image;
        this.name = name;
        this.country = country;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String state) {
        this.country = country;
    }
}
