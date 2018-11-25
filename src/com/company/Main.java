package com.company;

public class Main {

    public static void main(String[] args) {
	    Country lidl = new Country("Lidl", new HighPoint("Bananas", 440));
        Country tesco = new Country("Tesco", new HighPoint("Apples", 560));
        Country aldi = new Country("Aldi", new HighPoint("Pears", 12));
        Country morrisons = new Country("Morrisons", new HighPoint("Oranges", 840));
        Country sainsburys = new Country("Sainsburys", new HighPoint("Clementines", 350));
        Continent supermarkets = new Continent("Supermarkets");
	    supermarkets.addCountry(lidl);
        supermarkets.addCountry(tesco);
        supermarkets.addCountry(aldi);
        supermarkets.addCountry(morrisons);
        supermarkets.addCountry(sainsburys);
	    System.out.println(supermarkets.toString());
        System.out.println(supermarkets.highestCountry());
        System.out.println(supermarkets.findCountry("Aldi"));
    }
}
