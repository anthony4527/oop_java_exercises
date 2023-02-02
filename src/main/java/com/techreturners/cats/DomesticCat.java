package com.techreturners.cats;

public class DomesticCat implements Cat{

    private final int  AvgHeight = 23;
    private boolean Asleep = true; // default is sleeping

    public final String setting = "domestic";


    @Override public boolean isAsleep(){
        return Asleep; }
    @Override public void goToSleep(){
         Asleep = true;
         }
    @Override public void wakeUp(){
        Asleep = false;
    }

    @Override public String eat(){
        return "Purrrrrrr";
    }

    @Override public void run(){
        System.out.println ("Domestic Cat runs slowly");
    }

    @Override public String getSetting(){
        return setting;
    }

    @Override public int getAverageHeight(){
        return AvgHeight;

    }

}

