package com.lewis73.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void negativeValueForN() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(-1, new int []{1, 2, 3}));
        assertEquals(ex.getMessage(), "n is negative");
    }

    @Test
    void arrayDoesntContainNelements() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(4, new int []{1, 2, 3}));
        assertEquals(ex.getMessage(), "array does not contain 4 elements");
    }

    @Test
    void arrayHasTooManyElements() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2, new int []{1, 2, 3}));
        assertEquals(ex.getMessage(), "expected array to have 2 elements but found 3 elements");
    }

    @Test
    void acceptsZeroValueForN() {
        assertEquals(SimpleArraySum.simpleArraySum(0, new int [] {}), 0);
    }

    @Test
    void happyPositive() {
        assertEquals(SimpleArraySum.simpleArraySum(3,new int []{1, 2, 3}), 6);
    }

    @Test
    void happyNegative() {
        assertEquals(SimpleArraySum.simpleArraySum(3,new int []{-1, 2, -3}), -2);
    }

    @Test
    void ignoresOverflow() {
        assertEquals(SimpleArraySum.simpleArraySum(2,new int []{2_147_483_647, 1}),-2_147_483_648);
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2,new int []{2_147_483_647, 1}));
//        assertThat(ex.getMessage(), is("positive overflow"));
    }

    @Test
    void ignoresUnderflow() {
        assertEquals(SimpleArraySum.simpleArraySum(2,new int []{-2_147_483_648, -1}), 2_147_483_647);
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2,new int []{-2_147_483_648, -1}), is(2_147_483_647));
//        assertThat(ex.getMessage(), is("negative overflow"));
    }
}