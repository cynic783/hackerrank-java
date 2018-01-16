package com.lewis73.hackerrank;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void happy() {
        assertThat(SolveMeFirst.solveMeFirst(1, 1), is(2));
    }

    @Test
    void ignoresOverflow() {
        assertThat(SolveMeFirst.solveMeFirst(2_147_483_647, 1), is(-2_147_483_648));
    }

    @Test
    void ignoresUnderflow() {
        assertThat(SolveMeFirst.solveMeFirst(-2_147_483_648, -1), is(2_147_483_647));
    }
}