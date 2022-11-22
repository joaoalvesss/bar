package org.example;

public class HumanClient implements Client{
    HumanClient(){

    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        bar.order(drink, recipe);
    }
    @Override
    public void happyHourStarted(Bar bar) {
        bar.startHappyHour();
    }
    @Override
    public void happyHourEnded(Bar bar) {
        bar.endHappyHour();
    }
}
