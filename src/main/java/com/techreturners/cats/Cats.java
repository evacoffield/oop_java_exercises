package com.techreturners.cat;
  
public class Cats implements Cat {

    public Cats (Sting name, String setting, int height, Boolean isAsleep, String reaction) {
        this.name = name;
        this.setting = setting;
        this.height = height;
        this.isAsleep = isAsleep;
        this.sound = sound;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
      }

    public void goToSleep() {
        return isAsleep = true;
        System.out.println("Cat should be snoozing");
    }

    public void wakeUp() {
        System.out.println("Wake up");
    }

    public static void main(String[] args) {
        Cat Lion = new Cat("Lion", "wild", 1100, true);
        Lion.goToSleep();
        Lion.wakeUp();
    }
}

class DomesticCat extends Cats {
    public static void main(String[] args) {
        DomesticCat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
    }
    public void animalSound() {
        System.out.println("Purrrrrrr");
    }
}
class LionCat extends Cats {
    public static void main(String[] args) {
        LionCat lionCat = new LionCat();
        lionCat.goToSleep();
        lionCat.wakeUp();
    }
    public void animalSound() {
        System.out.println("Roar!!!!");
    }
}
class CheetahCat extends Cats {
    public static void main(String[] args) {
        CheetahCat cheetahCat = new CheetahCat();
        cheetahCat.goToSleep();
        cheetahCat.wakeUp();
    }
    public void animalSound() {
        System.out.println("Zzzzzzz");
    }
}