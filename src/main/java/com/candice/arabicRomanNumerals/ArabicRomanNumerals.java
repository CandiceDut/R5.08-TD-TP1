package com.candice.arabicRomanNumerals;

public class ArabicRomanNumerals {
    private int[] values = {1000, 500, 100, 50, 10, 5, 1};
    private String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};

    public String convert(int chiffre){
        StringBuilder romain = new StringBuilder();
        if(chiffre <= 0){
            return "negatif non supporte";
        }

        return romain.toString();
    }
}
