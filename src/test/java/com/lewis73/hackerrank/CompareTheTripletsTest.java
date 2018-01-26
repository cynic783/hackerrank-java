package com.lewis73.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CompareTheTripletsTest {

    @Test
    void outOfRange1To100() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> CompareTheTriplets.solve(0, 1, 1, 1, 1, 1));
        assertEquals(ex.getMessage(), "values must be in range 1..100");
    }

    @Test
    void happyTie() {
        int [] result = CompareTheTriplets.solve(1, 1, 1, 1, 1, 1);
        assertArrayEquals(new int [] {0, 0}, result);
    }

    @Test
    void happyTie2() {
        int [] result = CompareTheTriplets.solve(2, 1, 1, 1, 2, 1);
        assertArrayEquals(new int [] {1, 1}, result);
    }

    @Test
    void happyWinA() {
        int [] result = CompareTheTriplets.solve(2, 1, 1, 1, 1, 1);
        assertArrayEquals(new int [] {1, 0}, result);
    }

    @Test
    void happyWinA2() {
        int [] result = CompareTheTriplets.solve(2, 1, 2, 1, 2, 1);
        assertArrayEquals(new int [] {2, 1}, result);
    }

    @Test
    void happyWinB() {
        int [] result = CompareTheTriplets.solve(1, 1, 1, 2, 1, 1);
        assertArrayEquals(new int [] {0, 1}, result);
    }

    @Test
    void happyWinB2() {
        int [] result = CompareTheTriplets.solve(1, 2, 1, 2, 1, 2);
        assertArrayEquals(new int [] {1, 2}, result);
    }
}