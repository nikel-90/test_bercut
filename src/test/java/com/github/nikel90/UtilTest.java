package com.github.nikel90;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest {

    /**
     * Checking the correctness of the error counter.
     */
    @Test
    public void checkingCountError() {
        int expectedCount = 5;

        int actualCount = Util.countError(1, 4);

        Assert.assertEquals(expectedCount, actualCount);
    }

    /**
     * Checking the correctness of the error counter with negative numbers.
     */
    @Test
    public void checkingCountErrorWithNegativeNumbers() {
        int expectedCount = 0;

        int actualCount = Util.countError(-4, 4);

        Assert.assertEquals(expectedCount, actualCount);
    }
}
