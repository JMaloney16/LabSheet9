package com.company;

public class Country {
    private String name;
    private HighPoint highestPoint;

    public Country(String name, HighPoint highestPoint) {
        this.name = name;
        this.highestPoint = highestPoint;
    }

    @Override
    public String toString() {
        return "\nCountry Name: " + name + "\n" + highestPoint.toString() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HighPoint getHighestPoint() {
        return highestPoint;
    }

    public int getHighestPointValue(){
        return highestPoint.getHeight();
    }

    public void setHighestPoint(HighPoint highestPoint) {
        this.highestPoint = highestPoint;
    }
}
