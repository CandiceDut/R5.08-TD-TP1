package com.candice.personnage;

public class Personnage {
    private int orientationIndex = 0;
    private String[] orientations = {"NORD", "EST", "SUD", "OUEST"};

    public String tourner(int nbTour){
        orientationIndex = (orientationIndex + nbTour) % 4;
        return orientations[orientationIndex];
    }
}
