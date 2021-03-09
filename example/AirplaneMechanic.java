package com.example;

//ex10

public class AirplaneMechanic extends Mechanic
{
    protected int m_rank;

    @Override
    public void repair()
    {
        System.out.println("Repairing airplane...");
    }

    public void checkEngine()
    {
        System.out.println("Checking the engine...");
    }


}
