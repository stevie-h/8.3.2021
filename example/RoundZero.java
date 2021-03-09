package com.example;

//ex22

public class RoundZero
{
    public static float roundUp(float num)
    {
        if (num == 0)
        {
            return 0;
        }
        if (num > 0 && num <= 1)
        {
            return 1;
        }
        System.out.println("The number must be between 0 and 1!");
        return -1;
    }

    public static float roundDown(float num)
    {
        if (num == 1)
        {
            return 1;
        }
        if (num < 1 && num >= 0)
        {
            return 0;
        }
        System.out.println("The number must be between 0 and 1!");
        return -1;
    }

    public static float round(float num)
    {
        if (num >= 0 && num < 0.5)
        {
            return 0;
        }
        if (num >= 0.5 && num <= 1)
        {
            return 1;
        }
        System.out.println("The number must be between 0 and 1!");
        return -1;
    }

}
