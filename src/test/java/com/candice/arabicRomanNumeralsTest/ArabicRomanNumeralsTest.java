/*
1- plus petit chiffre possible (1)
2- plus grand chiffre possible (3999)
3- chiffres simples (additions)
4- chiffres soustraits (soutractions)
 */

package com.candice.arabicRomanNumeralsTest;

import com.candice.arabicRomanNumerals.ArabicRomanNumerals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralsTest {
    ArabicRomanNumerals chiffreRomain = new ArabicRomanNumerals();

    @Test
    void convert_negatif_retourne_erreur(){
        //GIVEN
        int chiffre = -1;

        //WHEN
        String result = chiffreRomain.convert(chiffre);

        //THEN
        assertThat(result).isEqualTo("negatif non supporte");
    }
}
