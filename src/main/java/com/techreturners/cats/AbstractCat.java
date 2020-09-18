package com.techreturners.cats;

abstract class AbstractCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int height;

    public abstract String eat();

    public AbstractCat (String setting, int height, Boolean isAsleep) {
        this.isAsleep = isAsleep;
        this.setting = setting;
        this.height = height;
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

    public void wakeUp() {
        this.isAsleep = false;
    }
    public void goToSleep() {
        this.isAsleep = true;
    }
}