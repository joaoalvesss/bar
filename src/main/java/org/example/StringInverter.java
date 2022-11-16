package org.example;

public class StringInverter implements StringTransformer{
    private String name;
    StringInverter(){
        name = "";
    }
    @Override
    public void execute(StringDrink drink){
        String n1 = drink.getText();
        String n2 = new StringBuilder(n1).reverse().toString();
        drink.setText(n2);
    }
}
