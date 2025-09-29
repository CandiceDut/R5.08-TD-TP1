package com.candice.arabicRomanNumerals;

public class ArabicRomanNumerals {
    private int[] values = {1000, 500, 100, 50, 10, 5, 1};
    private String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};

    public String convert(int chiffre){
        StringBuilder romain = new StringBuilder();
        if(chiffre <= 0 || chiffre > 3999){
            return "Nombre hors limite";
        }

        for (int i = 0; i < values.length; i++) {
            while (chiffre >= values[i]) {
                chiffre -= values[i];
                romain.append(symbols[i]);
            }

            if (i % 2 == 0 && i + 2 < values.length) {
                int subtractValue = values[i] - values[i + 2];
                if (chiffre >= subtractValue && isSubtractible(symbols[i + 2], symbols[i])) {
                    romain.append(symbols[i + 2]).append(symbols[i]);
                    chiffre -= subtractValue;
                }
            }

            if (i + 1 < values.length) {
                int subValue = values[i] - values[i + 1];
                if (chiffre >= subValue && isSubtractible(symbols[i + 1], symbols[i])) {
                    romain.append(symbols[i + 1]).append(symbols[i]);
                    chiffre -= subValue;
                }
            }
        }

        return romain.toString();
    }

    private static boolean isSubtractible(String small, String large) {
        return (small.equals("I") && (large.equals("V") || large.equals("X")))
                || (small.equals("X") && (large.equals("L") || large.equals("C")))
                || (small.equals("C") && (large.equals("D") || large.equals("M")));
    }
}
