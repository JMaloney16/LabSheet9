package com.company;

import java.util.ArrayList;

public class Continent {
    private String name;
    private ArrayList<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.countries = new ArrayList<Country>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    @Override
    public String toString() {
        return "Continent Name: " + name + "\n" + "Countries: " + countries.toString() + "\n";
    }
    
    public String highestCountry() {
        Country highestCountry = countries.get(0);
        for (Country country : countries) {
            if (country.getHighestPointValue() > highestCountry.getHighestPointValue()){
                highestCountry = country;
            }
        }
        System.out.println("Country with the highest point: ");
        return highestCountry.toString();
    }

    public String findCountry(String name){
        String searchCountry = "Can't find country";
        for (Country country: countries) {
            if (country.getName().equals(name)){
                searchCountry = country.toString();
            }
        }
        return searchCountry;
    }
}
