package com.techreturners.cats;

abstract class WildCat implements Cat {

    private String type;
    private final int AvgHeight = 1100; //average height for wild cat species
    private boolean Asleep = true; // default is sleeping

    public final String setting = "wild";

    public boolean isAsleep() {
        return Asleep;
    }
    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return AvgHeight;
    }

    //default method
    public void goToSleep() {
        Asleep = true;
    }

    public void wakeUp(){
        Asleep = false;
    }
    public abstract String eat();



}