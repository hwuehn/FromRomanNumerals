package com.fromromannumerals.data;

import java.util.ArrayList;
import java.util.List;

public class RoemischeZahlen {

    public List<String> getRoemischeZahlen() {
        return roemischeZahlen;
    }

    private List<String> roemischeZahlen = new ArrayList<>();

    public List<String> getZahlen() {
        return zahlen;
    }

    private List<String> zahlen = new ArrayList<>();

    public List<Integer> getSumZahlen() {
        return sumZahlen;
    }

    private List<Integer> sumZahlen = new ArrayList<>();

    public void createList(String roemischeZahl) {
       for (int i = 0; i < roemischeZahl.length(); i++) {
           roemischeZahlen.add(roemischeZahl.substring(i,i+1));

       }
        System.out.println(roemischeZahlen);
    }

    public void transform(List<String> roemischeZahlen) {
        roemischeZahlen.stream().map(e -> e
                .replace("I","1").replace("V", "5")
                .replace("X", "10").replace("L","50")
                .replace("C","100").replace("M","1000")).forEach(e -> zahlen.add(e));
    }

    public void parseStringToInt(List<String> zahlen) {
        zahlen.stream().mapToInt(e -> Integer.parseInt(e)).forEach(e -> sumZahlen.add(e));
        System.out.println(getSumZahlen());
    }

    public void sumElements(List<Integer> zahlen) {
        System.out.println(zahlen.stream().reduce( 0, (e1,e2) -> e1 + e2));
    }





    }

