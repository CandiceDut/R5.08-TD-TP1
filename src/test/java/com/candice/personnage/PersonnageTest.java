/*
1- faire tourner pour atteindre chaque orientation
 */

package com.candice.personnage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {
    Personnage perso = new Personnage();

    @ParameterizedTest
    @CsvSource({
            "1, EST",
            "2, SUD",
            "3, OUEST",
            "4, NORD",
            "5, EST",
            "6, SUD",
            "0, NORD"
    })
    void tourner_1_quart_de_tour_donne_Est(int nbTour, String res){
        //WHEN
        String result = perso.tourner(nbTour);

        //THEN
        assertThat(result).isEqualTo(res);
    }
}
