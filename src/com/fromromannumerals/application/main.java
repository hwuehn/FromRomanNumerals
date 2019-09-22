package com.fromromannumerals.application;

import com.fromromannumerals.data.RoemischeZahlen;

public class main {

    public static void main(String[] args) {
        RoemischeZahlen test = new RoemischeZahlen();
        test.createStringList("MMXIII");
        test.transformToStringNumbers(test.getRoemischeZahlen());
        test.parseStringListToIntList(test.getZahlen());
        test.sumElements(test.getParsedZahlen());
    }
}
