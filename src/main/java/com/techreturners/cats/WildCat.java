package com.techreturners.cats;

abstract class WildCat implements Cat {

    private final int AvgHeight = 1100; //average height for wild cat species
    private boolean Asleep = true; // default is sleeping

    public final String setting = "wild";

    @Override
    public boolean isAsleep() {
        return Asleep;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return AvgHeight;
    }

    //default method
    @Override
    public void goToSleep() {
        Asleep = true;
    }

    @Override
    public void wakeUp() {
        Asleep = false;
    }

    //eat is abstract method for different implementation
    public abstract String eat();

    @Override
    public void run() {
        System.out.println("Wild Cat runs fast"); //default method for astract class
    }


}