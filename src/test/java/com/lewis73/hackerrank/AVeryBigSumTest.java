package com.lewis73.hackerrank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVeryBigSumTest {

    @Test
    void sadNPE() {
        assertThrows(NullPointerException.class, () -> AVeryBigSum.solve(null));
    }

    @Test
    void degenerate() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> AVeryBigSum.solve(new long [] {}));
        assertEquals(ex.getMessage(), "array must not be empty");
    }

    @Test
    void sadOutOfRangeNegative() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> AVeryBigSum.solve(new long [] {-1}));
        assertEquals(ex.getMessage(), "elements must be between 0 and 10^10, inclusive");
    }

    @Test
    void sadOutOfRangeTooBig() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> AVeryBigSum.solve(new long [] {10_000_000_001L}));
        assertEquals(ex.getMessage(), "elements must be between 0 and 10^10, inclusive");
    }

    @Disabled
    @Test
    void sadOverflow() {
        assertThrows(ArithmeticException.class, () -> AVeryBigSum.solve(new long [] {Long.MAX_VALUE, 1}));
    }
}