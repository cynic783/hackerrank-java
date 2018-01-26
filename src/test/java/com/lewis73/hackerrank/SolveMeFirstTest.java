package com.lewis73.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveMeFirstTest {

    @Test
    void happyPositive() {
        assertEquals(SolveMeFirst.solveMeFirst(1, 1), 2);
    }

    @Test
    void happyNegative() {
        assertEquals(SolveMeFirst.solveMeFirst(-1, -1), -2);
    }

    @Test
    void ignoresOverflow() {
        assertEquals(SolveMeFirst.solveMeFirst(2_147_483_647, 1), -2_147_483_648);
    }

    @Test
    void ignoresUnderflow() {
        assertEquals(SolveMeFirst.solveMeFirst(-2_147_483_648, -1), 2_147_483_647);
    }
}