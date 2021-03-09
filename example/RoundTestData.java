package com.example;

//ex22

public class RoundTestData
{
    //RoundUp
    static final float testRoundUpZeroN = 0f;
    static final float testRoundUpZeroExpectedResult = 0f;

    static final float testRoundUpOneN = 1f;
    static final float testRoundUpOneExpectedResult = 1f;

    static final float testRoundUpZeroPointLowN = 0.1f;
    static final float testRoundUpZeroPointLowExpectedResult = 1f;

    static final float testRoundUpZeroPointHighN = 0.9f;
    static final float testRoundUpZeroPointHighExpectedResult = 1f;

    static final float testRoundUpOverOneN = 1.1f;
    static final float testRoundUpOverOneExpectedResult = -1f;

    static final float testRoundUpUnderZeroN = -0.1f;
    static final float testRoundUpUnderZeroExpectedResult = -1f;

    //RoundDown
    static final float testRoundDownOneN = 1f;
    static final float testRoundDownOneExpectedResult = 1f;

    static final float testRoundDownZeroN = 0f;
    static final float testRoundDownZeroExpectedResult = 0f;

    static final float testRoundDownZeroPointLowN = 0.1f;
    static final float testRoundDownZeroPointLowExpectedResult = 0f;

    static final float testRoundDownZeroPointHighN = 0.9f;
    static final float testRoundDownZeroPointHighExpectedResult = 0f;

    static final float testRoundDownOverOneN = 1.1f;
    static final float testRoundDownOverOneExpectedResult = -1f;

    static final float testRoundDownUnderZeroN = -0.1f;
    static final float testRoundDownUnderZeroExpectedResult = -1f;

    //Round
    static final float testRoundOneN = 1f;
    static final float testRoundOneExpectedResult = 1f;

    static final float testRoundZeroN = 0f;
    static final float testRoundZeroExpectedResult = 0f;

    static final float testRoundZeroPointFiveN = 0.5f;
    static final float testRoundZeroPointFiveExpectedResult = 1f;

    static final float testRoundZeroPointLowN = 0.1f;
    static final float testRoundZeroPointLowExpectedResult = 0f;

    static final float testRoundZeroPointFourN = 0.4f;
    static final float testRoundZeroPointFourExpectedResult = 0f;

    static final float testRoundZeroPointSixN = 0.6f;
    static final float testRoundZeroPointSixExpectedResult = 1f;

    static final float testRoundZeroPointHighN = 0.9f;
    static final float testRoundZeroPointHighExpectedResult = 1f;

    static final float testRoundOverOneN = 1.1f;
    static final float testRoundOverOneExpectedResult = -1f;

    static final float testRoundUnderZeroN = -0.1f;
    static final float testRoundUnderZeroExpectedResult = -1f;

}
