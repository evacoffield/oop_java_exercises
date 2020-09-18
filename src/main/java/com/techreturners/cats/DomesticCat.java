package com.techreturners.cats;

import java.lang.Math;

public class DomesticCat extends AbstractCat {
    public DomesticCat() {
        super ("domestic", 23, false);
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
}