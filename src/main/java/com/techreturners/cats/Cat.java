package com.techreturners.cats;

import java.lang.Math;
interface Cat {
    public boolean isAsleep();
    public String getSetting();
    public int getAverageHeight();
    public String eat();
    public void wakeUp();
    public void goToSleep();
}
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
        if(randomIndex>0.66){
            return "It will do I suppose";
        }
        else{
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
class CheetahCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int height;
    public CheetahCat() {
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
        return "Zzzzzzz";
    }
    public void wakeUp() {
        this.isAsleep = false;
    }
    public void goToSleep() {
        this.isAsleep = true;
    }
}