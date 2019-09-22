package com.fromromannumerals.data;

import java.util.ArrayList;
import java.util.List;

public class RoemischeZahlen {

    private List<String> roemischeZahlen = new ArrayList<>();
    private List<String> zahlen = new ArrayList<>();
    private List<Integer> sumZahlen = new ArrayList<>();

    public List<String> getRoemischeZahlen() {
        return roemischeZahlen;
    }
    public List<String> getZahlen() {
        return zahlen;
    }
    public List<Integer> getParsedZahlen() {
        return sumZahlen;
    }

    public void createStringList(String roemischeZahl) {
        System.out.println("Roemische Zahl: " + roemischeZahl);
        for (int i = 0; i < roemischeZahl.length(); i++) {
           roemischeZahlen.add(roemischeZahl.substring(i,i+1));
       }
        System.out.println("Liste (String): " + roemischeZahlen);
    }

    public void transformToStringNumbers(List<String> roemischeZahlen) {
        roemischeZahlen.stream().map(e -> e
                .replace("I","1").replace("V", "5")
                .replace("X", "10").replace("L","50")
                .replace("C","100").replace("M","1000")).forEach(e -> zahlen.add(e));
    }

    public void parseStringListToIntList(List<String> zahlen) {
        zahlen.stream().mapToInt(e -> Integer.parseInt(e)).forEach(e -> sumZahlen.add(e));
        System.out.println("Liste (Integer): " + getParsedZahlen());
    }

    public void sumElements(List<Integer> zahlen) {
        System.out.println("Summe (Dezimalzahl): " + zahlen.stream().reduce( 0, (e1,e2) -> e1 + e2));
    }
}

