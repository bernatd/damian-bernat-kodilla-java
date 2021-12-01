package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void testProbablyWillThrowAnException() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2.0, 5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(0.5, 5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(10.0, 1.5)),
                () -> assertDoesNotThrow(() -> sc.probablyIWillThrowException(1.5, 3))
        );
    }
}
