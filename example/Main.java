package com.example;

import java.util.ArrayList;

public class Main
{

// https://qaarchint.files.wordpress.com/2021/03/java_exercise_08_03_21.pdf

    public static void main(String[] args)
    {

        //ex1
        // We would use the override option (can be indicated by @override):
        // creating a method with the same name in a derived class.
        // This way we can implement different actions for specific derived classes compared with the base class.

        //ex5
        Teacher maths = new MathTeacher();
        Teacher hist = new HistoryTeacher();


        //ex6
        System.out.println(maths.m_name);     // OK (will return null as no info was entered)
        //System.out.println(maths.m_math_skills);
        // m_math_skills is not reachable from the created instance as it does not exist in the Teacher class.

        //ex7
        // An abstract class is a class we can't create an instance of.
        // It can inherit from another abstract class.

        //ex8
        // An abstract method is a method with no body of code, and it must be implemented in
        // all derived classes. It cannot be defined as private since no derived classes will be able
        // to implement it as required.

        //ex9
        // An abstract class may contain abstract and non-abstract methods. It can contain
        // only non-abstract (implemented) methods.

        //ex11
        ElectricDevice tv = new TV(54f);
        ElectricDevice phone = new Cellphone("iPhone");

        //ex12
        // It is not possible to inherit from a final class.
        // It would be preferable to define a class as final for security reasons (to prevent accessing
        // the info through a subclass) or when wanting uniformity of use, such as data types
        // e.g. integer or String.

        //ex13+ex16
        // An interface is a collection of abstract methods (that classes implementing it will need to
        // define) without defining an actual abstract class. We can use it to allow classes to use the
        // same characteristics but without connecting them through a specific type of base class, or when
        // wishing for a class to "inherit" from multiple sources, since multiple class inheritance is not
        // available in Java. However, in an abstract class we will be able to define members.


        //ex17
        IMusicPlayer guitar1 = new GuitarPlayer();
        IMusicPlayer piano1 = new PianoPlayer();

        //ex18
        // ArrayList is a list of variables. Unlike a regular array, we can add or delete items to it.
        // An ArrayList class need to be imported in order to use it.

        //ex19
        ArrayList<Integer> num19 = new ArrayList<>();
        num19.add(5);
        num19.add(7);
        num19.add(9);
        System.out.println(num19);               //b
        System.out.println(num19.get(0));        //c
        num19.remove(1);                   //c2
        System.out.println(num19.indexOf(9));    //d

        //ex21
        // @Test indicates that the upcoming method will be executed as a test and not a regular run.
        // assertEquals compares the two variables entered,
        // for testing: one defined by the user and one the result of the executed test.

    }


    //ex17
    public void startMusicShow(MusicPlayer pl)
    {
        pl.play();
        if (pl instanceof GuitarPlayer)
        {
            System.out.println("Guitar player!");
            ((GuitarPlayer) pl).rockAndRoll();
        }
        else if (pl instanceof PianoPlayer)
        {
            System.out.println("Piano player!");
            ((PianoPlayer) pl).playJazz();
        }
    }

    //ex11
    public static void repairElectricDevice(ElectricDevice ed)
    {
        if (ed.m_worksOnBatteries == true)
        {
            ed.insertNewBatteries();
        }
        if (ed.m_isFaulty == false)
        {
            return;
        }
        else
        {
            ed.fixDevice();
            if (ed instanceof TV)
            {
                System.out.print("Device is TV, screen size: ");
                System.out.println(((TV) ed).m_screen_size);
            }
            else if (ed instanceof Cellphone)
            {
                System.out.print("Device is cellphone, brand: ");
                System.out.println(((Cellphone) ed).m_brand);
            }
            System.out.println("Fixing is done!");
        }
    }

    //ex6b
    public static void identifyTeacher(Teacher t)
    {
        if (t instanceof MathTeacher)
        {
            System.out.println("Maths teacher!");
        }
        else if (t instanceof HistoryTeacher)
        {
            System.out.println("History teacher!");
        }
    }

    //ex6c
    public static void identifyTeacherMore(Teacher t)
    {
        if (t instanceof MathTeacher)
        {
            System.out.print("Maths teacher! Skills: ");
            System.out.println(((MathTeacher) t).m_math_skills);
        }
        else if (t instanceof HistoryTeacher)
        {
            System.out.print("History teacher! Profession: ");
            System.out.println(((HistoryTeacher) t).m_field_of_profession);
        }
    }



}
