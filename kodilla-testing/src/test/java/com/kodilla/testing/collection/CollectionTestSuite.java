package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When provide empty list, then OddNumberExterminator should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        Integer[] numbers = {};
        Integer[] evenNumbers = {};
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(Arrays.asList(numbers));

        //Then
        Assertions.assertEquals(Arrays.asList(evenNumbers), result);
    }

    @DisplayName(
            "When provide list of numbers, " +
            "then OddNumberExterminator should return list of even numbers"
    )
    @Test
    void testOddNumberExterminatorNormalList() {
        //Given
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Integer[] evenNumbers = {2, 4, 6, 8, 10, 12, 14, 16};
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(Arrays.asList(numbers));

        //Then
        Assertions.assertEquals(Arrays.asList(evenNumbers), result);
    }
}
