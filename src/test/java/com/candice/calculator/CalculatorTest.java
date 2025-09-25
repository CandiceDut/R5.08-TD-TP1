package com.candice.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.candice.calculator.Calculator.add;
import static com.candice.calculator.Calculator.divide;
import static org.assertj.core.api.Assertions.assertThat;

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
}
