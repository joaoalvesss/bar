package org.example;

public class StringDrink
{
    private String name;

    StringDrink(String drinkName){
        name = drinkName;
    }
    public void setText(String drinkName){
        name = drinkName;
    }
    public String getText(){
        return name;
    }
}
