package com.company;

public class Main {

    public static void main(String[] args) {
	    livingThings lT = new livingThings();
	    Carnivore cV = new Carnivore();
	    Herbivore hV = new Herbivore();

	    lT.food();
	    cV.food();
        hV.food();
    }
}
