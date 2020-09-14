package com.techreturners.cats;

import java.lang.Math;

class DomesticCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int height;
    public DomesticCat() {
        this.isAsleep = false;
        this.setting = "domestic";
        this.height = 23;
    }
    public boolean isAsleep() {
        return this.isAsleep;
    }
    public String getSetting() {
        return this.setting;
    }
    public int getAverageHeight() {
        return height;
    }
    public String eat() {
        double randomIndex = Math.random();
        //Choosing reaction based on random index making Purrr more frequent
        if (randomIndex > 0.66) {
            return "It will do I suppose";
        } else {
            return "Purrrrrrr";
        }
    }
    public void wakeUp() {
        this.isAsleep = false;
    }
    public void goToSleep() {
        this.isAsleep = true;
    }
}