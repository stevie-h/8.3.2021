package com.example;

//ex17

public class PianoPlayer extends MusicPlayer
{
    @Override
    public void play()
    {
        System.out.println("Playing Bach...");
    }

    @Override
    public void compose()
    {
        System.out.println("Composing piano melody...");
    }

    public void practice()
    {
        System.out.println("Practice makes perfect!");
    }

    public void playJazz()
    {
        System.out.println("Playing 'I Got Rhythm' by George Gershwin...");
    }


}
