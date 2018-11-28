package com.company;

public class HighPoint {
    private String name;
    private int height;

    public HighPoint(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Highest Point: " + name + "\n" + "Height: " + height;
    }



    public int getHeight() {
        return height;
    }

}
