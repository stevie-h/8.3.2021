package com.example;

import java.time.LocalTime;

//ex10

public class CarMechanic extends Mechanic
{

    protected String[] m_car_types_i_can_repair;

    @Override
    public void repair()
    {
        System.out.println("Repairing car...");
    }

    public void replaceWheel()
    {
        System.out.println("Replacing the damaged wheel...");
    }

}
