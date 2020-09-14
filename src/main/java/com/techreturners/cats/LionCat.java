package com.techreturners.cats;

class LionCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int height;
    public LionCat() {
        this.isAsleep = false;
        this.setting = "wild";
        this.height = 1100;
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
        return "Roar!!!!";
    }
    public void wakeUp() {
        this.isAsleep = false;
    }
    public void goToSleep() {
        this.isAsleep = true;
    }
}