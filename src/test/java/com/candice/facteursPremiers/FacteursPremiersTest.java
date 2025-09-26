package com.candice.facteursPremiers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;

import static com.candice.facteursPremiers.FacteursPremiers.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {
    @Test
    void generer_retourne_vide_quand_egal_1(){
        //GIVEN
        int nb = 1;

        //WHEN
        ArrayList<Integer> result = generer(nb);

        //THEN
        assertThat(result).isEqualTo(new ArrayList<Integer>());
    }

    @Test
    void generer_retourne_bien_plusieurs_diviseurs(){
        //GIVEN
        int nb1 = 8;
        ArrayList<Integer> nb2 = new ArrayList<>(Arrays.asList(2, 2, 2));

        //WHEN
        ArrayList<Integer> result = generer(nb1);

        //THEN
        assertThat(result).isEqualTo(nb2);
    }

    @Test
    void generer_retourne_bien_quand_premier(){
        //GIVEN
        int nb1 = 7;
        ArrayList<Integer> nb2 = new ArrayList<>(Arrays.asList(7));

        //WHEN
        ArrayList<Integer> result = generer(nb1);

        //THEN
        assertThat(result).isEqualTo(nb2);
    }

    @Test
    void generer_retourne_bien_grand_nombre(){
        //GIVEN
        int nb1 = 1232;
        ArrayList<Integer> nb2 = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 7, 11));

        //WHEN
        ArrayList<Integer> result = generer(nb1);

        //THEN
        assertThat(result).isEqualTo(nb2);
    }
}
