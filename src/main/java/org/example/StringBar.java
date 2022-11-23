package org.example;

public class StringBar extends Bar{
    private boolean happyHour;
    StringBar(){
        happyHour = false;
    }
    public boolean isHappyHour(){
        return happyHour;
    }
    public void startHappyHour(){
        happyHour = true;
        this.notifyObservers();
    }
    public void endHappyHour(){
        happyHour = false;
        this.notifyObservers();
    }
    public void order(StringDrink drink, StringRecipe recipe){

    }
}
