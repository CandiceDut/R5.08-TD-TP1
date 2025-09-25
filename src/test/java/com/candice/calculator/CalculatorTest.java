package com.candice.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static com.candice.calculator.Calculator.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void add_calcule_la_somme_de_deux_int(){
        //GIVEN
        int apG = 1;
        int apD = 2;

        //WHEN
        int result = add(apG, apD);

        //THEN
        assertThat(result).isEqualTo(3);
    }

    @Test
    void divide_divise_deux_int_non_egal_a_0(){
        //GIVEN
        int apG = 5;
        int apD = 2;

        //WHEN
        int result = divide(apG, apD);

        //THEN
        assertThat(result).isEqualTo(2);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })

    void add_parametre(int nb1, int nb2, int nb3){
        //WHEN
        int result = add(nb1, nb2);

        //THEN
        assertThat(result).isEqualTo(nb3);
    }

    @Test
    void ensemble_chiffre_renvoi_les_chiffres_uniques(){
        //GIVEN
        int nb = 1231234;

        //WHEN
        Set<Integer> result = ensembleChiffres(nb);

        //THEN
        assertThat(result).isEqualTo(Set.of(1, 2, 3, 4));
    }

    @Test
    void divide_diviseur_egal_a_0(){
        //GIVEN
        int apG = 5;
        int apD = 0;

        //WHEN
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            divide(apG, apD);
        });

        //THEN
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Division par 0 impossible.");
    }

    @Test
    void add_erreur_quand_depasse_max_value(){
        //GIVEN
        int apG = Integer.MAX_VALUE;
        int apD = 0;

        //WHEN
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            add(apG, apD);
        });

        //THEN
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("L'addition dépasse les limites max du int.");
    }

    @Test
    void add_erreur_quand_depasse_min_value(){
        //GIVEN
        int apG = Integer.MIN_VALUE;
        int apD = 0;

        //WHEN
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            add(apG, apD);
        });

        //THEN
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("L'addition dépasse les limites min du int.");
    }
}
