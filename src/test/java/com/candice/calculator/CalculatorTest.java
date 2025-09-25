package com.candice.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.candice.calculator.Calculator.add;
import static com.candice.calculator.Calculator.divide;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

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
}
