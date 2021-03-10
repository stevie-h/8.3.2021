package com.example;

//ex22

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoundTest
{
    RoundZero rz = new RoundZero();

    @Test
    public void testRoundUpZero()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpZeroN);
        assertEquals(RoundTestData.testRoundUpZeroExpectedResult, actualResult);
    }

    @Test
    public void testRoundUpOne()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpOneN);
        assertEquals(RoundTestData.testRoundUpOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundUpZeroPointLow()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpZeroPointLowN);
        assertEquals(RoundTestData.testRoundUpZeroPointLowExpectedResult, actualResult);
    }

    @Test
    public void testRoundUpZeroPointHigh()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpZeroPointHighN);
        assertEquals(RoundTestData.testRoundUpZeroPointHighExpectedResult, actualResult);
    }

    @Test
    public void testRoundUpOverOne()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpOverOneN);
        assertEquals(RoundTestData.testRoundUpOverOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundUpUnderZero()
    {
        float actualResult = rz.roundUp(RoundTestData.testRoundUpUnderZeroN);
        assertEquals(RoundTestData.testRoundUpUnderZeroExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownOne()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownOneN);
        assertEquals(RoundTestData.testRoundDownOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownZero()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownZeroN);
        assertEquals(RoundTestData.testRoundDownZeroExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownZeroPointLow()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownZeroPointLowN);
        assertEquals(RoundTestData.testRoundDownZeroPointLowExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownZeroPointHigh()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownZeroPointHighN);
        assertEquals(RoundTestData.testRoundDownZeroPointHighExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownOverOne()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownOverOneN);
        assertEquals(RoundTestData.testRoundDownOverOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundDownUnderZero()
    {
        float actualResult = rz.roundDown(RoundTestData.testRoundDownUnderZeroN);
        assertEquals(RoundTestData.testRoundDownUnderZeroExpectedResult, actualResult);
    }

    @Test
    public void testRoundOne()
    {
        float actualResult = rz.round(RoundTestData.testRoundOneN);
        assertEquals(RoundTestData.testRoundOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundZero()
    {
        float actualResult = rz.round(RoundTestData.testRoundZeroN);
        assertEquals(RoundTestData.testRoundZeroExpectedResult, actualResult);
    }

    @Test
    public void testRoundMidPoint()
    {
        float actualResult = rz.round(RoundTestData.testRoundMidPointN);

        assertEquals(RoundTestData.testRoundMidPointExpectedResult, actualResult);
    }

    @Test
    public void testRoundZeroPointLow()
    {
        float actualResult = rz.round(RoundTestData.testRoundZeroPointLowN);
        assertEquals(RoundTestData.testRoundZeroPointLowExpectedResult, actualResult);
    }

    @Test
    public void testRoundZeroPointFour()
    {
        float actualResult = rz.round(RoundTestData.testRoundMidPointUnderN);
        assertEquals(RoundTestData.testRoundMidPointUnderExpectedResult, actualResult);
    }

    @Test
    public void testRoundZeroPointSix()
    {
        float actualResult = rz.round(RoundTestData.testRoundMidPointOverN);
        assertEquals(RoundTestData.testRoundMidPointOverExpectedResult, actualResult);
    }

    @Test
    public void testRoundZeroPointHigh()
    {
        float actualResult = rz.round(RoundTestData.testRoundZeroPointHighN);
        assertEquals(RoundTestData.testRoundZeroPointHighExpectedResult, actualResult);
    }

    @Test
    public void testRoundOverOne()
    {
        float actualResult = rz.round(RoundTestData.testRoundOverOneN);
        assertEquals(RoundTestData.testRoundOverOneExpectedResult, actualResult);
    }

    @Test
    public void testRoundUnderZero()
    {
        float actualResult = rz.round(RoundTestData.testRoundUnderZeroN);
        assertEquals(RoundTestData.testRoundUnderZeroExpectedResult, actualResult);
    }

}
