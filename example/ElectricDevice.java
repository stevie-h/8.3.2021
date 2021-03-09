package com.example;

//ex11

public abstract class ElectricDevice
{
    protected float m_voltage;
    protected boolean m_worksOnBatteries;
    protected boolean m_isFaulty;


    public ElectricDevice(boolean m_worksOnBatteries)
    {
        this.m_worksOnBatteries = m_worksOnBatteries;
        this.m_isFaulty = false;
    }

    public void turnOn()
    {
        System.out.println("Turning device on...");
    }

    public final void insertNewBatteries()
    {
        if (m_worksOnBatteries == true)
        {
            System.out.println("Inserting new batteries to the device!");
        }
        else
        {
            System.out.println("This device doesn't use batteries!");
        }
    }

    public abstract void useDevice();
    public abstract void fixDevice();

}
