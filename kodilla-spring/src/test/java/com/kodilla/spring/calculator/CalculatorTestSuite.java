package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(5,5);
        double resultSub = calculator.sub(8,2);
        double resultMul = calculator.mul(4,3);
        double resultDiv = calculator.div(12,4);
        double resultDiv2 = calculator.div(122, 0);

        //Then
        assertEquals(10, resultAdd);
        assertEquals(6, resultSub);
        assertEquals(12, resultMul);
        assertEquals(3, resultDiv);
        assertEquals(0, resultDiv2);
    }
}
