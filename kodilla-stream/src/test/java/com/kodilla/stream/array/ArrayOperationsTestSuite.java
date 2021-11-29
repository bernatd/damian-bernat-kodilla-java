package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 4, 89, 23, 43, 876, 32, 567, 92,
                        5, 7, 234, 56, 732, 19, 75, 98, 328, 999};
        Array array = new Array();

        //When
        double result = array.getAverage(numbers);

        //Then
        assertEquals(214.1, result);
    }
}
