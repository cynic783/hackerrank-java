package com.lewis73.hackerrank;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void negativeValueForN() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(-1, new int []{1, 2, 3}));
        assertThat(ex.getMessage(), is("n is negative"));
    }

    @Test
    void arrayDoesntContainNelements() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(4, new int []{1, 2, 3}));
        assertThat(ex.getMessage(), is("array does not contain 4 elements"));
    }

    @Test
    void arrayHasTooManyElements() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2, new int []{1, 2, 3}));
        assertThat(ex.getMessage(), is("expected array to have 2 elements but found 3 elements"));
    }

    @Test
    void acceptsZeroValueForN() {
        assertThat(SimpleArraySum.simpleArraySum(0, new int [] {}), is(0));
    }

    @Test
    void happyPositive() {
        assertThat(SimpleArraySum.simpleArraySum(3,new int []{1, 2, 3}), is(6));
    }

    @Test
    void happyNegative() {
        assertThat(SimpleArraySum.simpleArraySum(3,new int []{-1, 2, -3}), is(-2));
    }

    @Test
    void ignoresOverflow() {
        assertThat(SimpleArraySum.simpleArraySum(2,new int []{2_147_483_647, 1}), is(-2_147_483_648));
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2,new int []{2_147_483_647, 1}));
//        assertThat(ex.getMessage(), is("positive overflow"));
    }

    @Test
    void ignoresUnderflow() {
        assertThat(SimpleArraySum.simpleArraySum(2,new int []{-2_147_483_648, -1}), is(2_147_483_647));
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SimpleArraySum.simpleArraySum(2,new int []{-2_147_483_648, -1}), is(2_147_483_647));
//        assertThat(ex.getMessage(), is("negative overflow"));
    }
}