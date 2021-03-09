package com.example;

//ex11

public class Cellphone extends ElectricDevice
{
    protected String m_brand;

    public Cellphone(String m_brand)
    {
        super(true);
        this.m_brand = m_brand;
    }


    @Override
    public void useDevice()
    {
        System.out.println("Talking on the phone...");
    }

    @Override
    public void fixDevice()
    {
        if (m_isFaulty == true)
        {
            System.out.println("Fixing cellphone...");
            m_isFaulty = false;
        }
        else
        {
            System.out.println("This cellphone is working properly!");
        }
    }

    // It is not possible to override the insertNewBatteries method since it is defined as final.


}
