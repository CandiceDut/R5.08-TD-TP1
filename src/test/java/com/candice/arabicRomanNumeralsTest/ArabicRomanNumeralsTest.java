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

    @Test
    void convert_1_retourne_I(){
        //GIVEN
        int chiffre = 1;

        //WHEN
        String result = chiffreRomain.convert(chiffre);

        //THEN
        assertThat(result).isEqualTo("I");
    }

    @ParameterizedTest
    @CsvSource({
            "2, II",
            "3, III",
            "5, V",
            "10, X",
            "20, XX",
            "50, L",
            "100, C",
            "500, D",
            "700, DCC",
            "1000, M",
            "2016, MMXVI",
            "2017, MMXVII",
            "2018, MMXVIII",
            "2020, MMXX",
            "2021, MMXXI",
            "2022, MMXXII",
            "2023, MMXXIII",
            "2025, MMXXV"
    })
    void convert_chiffres_simples_fait_la_bonne_addition(int chiffre, String romain){
        //WHEN
        String result = chiffreRomain.convert(chiffre);

        //THEN
        assertThat(result).isEqualTo(romain);
    }

    @Test
    void convert_max(){
        //GIVEN
        int chiffre = 3999;

        //WHEN
        String result = chiffreRomain.convert(chiffre);

        //THEN
        assertThat(result).isEqualTo("MMMCMXCIX");
    }

    @ParameterizedTest
    @CsvSource({
            "4, IV",
            "9, IX",
            "39, XXXIX",
            "499, ID",
            "1970, MCMLXX",
            "1971, MCMLXXI",
            "1972, MCMLXXII",
            "1973, MCMLXXIII",
            "1974, MCMLXXIV",
            "1975, MCMLXXV",
            "2019, MMXIX",
            "2024, MMXXIV"
    })
    void convert_chiffres_soustraits_fait_la_bonne_soustraction(int chiffre, String romain){
        //WHEN
        String result = chiffreRomain.convert(chiffre);

        //THEN
        assertThat(result).isEqualTo(romain);
    }
}
