package com.example;

//ex17

public class GuitarPlayer extends MusicPlayer
{

    @Override
    public void play()
    {
        System.out.println("Playing 'Hotel California', sorry!");
    }

    @Override
    public void compose()
    {
        System.out.println("Composing guitar melody...");
    }

    public void rockAndRoll()
    {
        System.out.println("Let the show begin!");
    }


}
