package com.fromromannumerals.application;

import com.fromromannumerals.data.RoemischeZahlen;

public class main {

    public static void main(String[] args) {
        RoemischeZahlen test = new RoemischeZahlen();
        test.createList("MMXIII");
        test.transform(test.getRoemischeZahlen());
        test.parseStringToInt(test.getZahlen());
        test.sumElements(test.getSumZahlen());



    }
}
