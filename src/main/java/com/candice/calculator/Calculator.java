package com.candice.calculator;

import java.util.Set;
import java.util.HashSet;

public class Calculator {
    public static int add(int opG, int opD) {
        if(opG + opD >= Integer.MAX_VALUE){
            throw new IllegalArgumentException("L'addition dépasse les limites max du int.");
        }
        else if(opG+opD <= Integer.MIN_VALUE){
            throw new IllegalArgumentException("L'addition dépasse les limites min du int.");
        }
        return opG + opD;
    }

    public static int divide(int opG, int opD) {
        if(opD == 0){
            throw new IllegalArgumentException("Division par 0 impossible.");
        }
        return opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre){
        Set<Integer> chiffres = new HashSet<>();
        int n = Math.abs(pNombre);

        if (n == 0) {
            chiffres.add(0);
        }

        while (n > 0) {
            int chiffre = n % 10;
            chiffres.add(chiffre);
            n /= 10;
        }

        return chiffres;
    }
}
