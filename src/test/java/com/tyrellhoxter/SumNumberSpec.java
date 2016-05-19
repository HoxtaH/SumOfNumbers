package com.tyrellhoxter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class SumNumberSpec {
    @Test
    public void SumNumberTest(){
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        int expected = 28;
        int actual = sumOfNumbers.Sum1ToNumber(7);
        Assert.assertEquals("The expected value should be every numbers sum up to 7", expected, actual);
    }
}
