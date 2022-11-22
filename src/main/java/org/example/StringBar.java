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
    }
    public void endHappyHour(){
        happyHour = false;
    }
    public void order(StringDrink drink, StringRecipe recipe){
        
    }
}
