package com.techreturners.cats;

public class LionCat extends AbstractCat {
    public LionCat() {
        super ("wild", 1100, false);
    }
    public String eat() {
        return "Roar!!!!";
    }
}