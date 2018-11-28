package com.company;

public class Main {

    public static void main(String[] args) {
	    Country uk = new Country("United Kingdom", new HighPoint("Ben Nevis", 1345));
        Country france = new Country("France", new HighPoint("Mont Blanc", 4810));
        Country italy = new Country("Italy", new HighPoint("Monte Blanco", 4810));
        Country germany = new Country("Germany", new HighPoint("Zugspite", 2962));
        Country sweden = new Country("Sweden", new HighPoint("Kebnekaise", 2097));
        Continent europe = new Continent("Europe");
	    europe.addCountry(uk);
        europe.addCountry(france);
        europe.addCountry(italy);
        europe.addCountry(germany);
        europe.addCountry(sweden);
	    System.out.println(europe.toString());
        System.out.println(europe.highestCountry());
        System.out.println(europe.findCountry("Germany"));
    }
}
