package com.candice.facteursPremiers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FacteursPremiers {
    public static ArrayList<Integer> generer(int nombre){
        ArrayList<Integer> facteurs = new ArrayList<>();

        if(nombre <= 1){
            return facteurs;
        }

        for (int i = 2; i <= nombre; i++) {
            while (nombre % i == 0) {
                facteurs.add(i);
                nombre /= i;
            }
        }
        return facteurs;
    }
}
