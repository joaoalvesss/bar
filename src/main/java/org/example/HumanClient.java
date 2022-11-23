package org.example;

public class HumanClient implements Client{
    private boolean happyHour = false;
    private OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy){ this.strategy = strategy; }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){}
    @Override
    public void happyHourStarted(Bar bar) {
        happyHour = true;
    }
    @Override
    public void happyHourEnded(Bar bar) {
        happyHour = false;
    }
}
