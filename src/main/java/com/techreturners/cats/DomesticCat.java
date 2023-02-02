package com.techreturners.cats;

public class DomesticCat implements Cat{

    private String type;
    private final int  AvgHeight = 23;
    private boolean Asleep = true; // default is sleeping

    public final String setting = "domestic";

    public boolean isAsleep(){
        return Asleep; }
    public void goToSleep(){
         Asleep = true;
         }
    public void wakeUp(){
        Asleep = false;
    }

    public String eat(){
        return "Purrrrrrr";
    }
    public String getSetting(){
        return setting;
    }

    public int getAverageHeight(){
        return AvgHeight;

    }


}

