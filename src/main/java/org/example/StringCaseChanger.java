package org.example;

public class StringCaseChanger implements StringTransformer{
    private String name;
    StringCaseChanger(){
        name = "";
    }
    @Override
    public void execute(StringDrink drink){
        StringBuilder n = new StringBuilder(drink.getText());
        for(int i = 0; i < n.length(); i++){
            if(Character.isLowerCase(n.charAt(i)))
                n.replace(i,i+1,Character.toString(Character.toUpperCase(n.charAt(i))));
            else
                n.replace(i,i+1,Character.toString(Character.toLowerCase(n.charAt(i))));
        }
        drink.setText(n.toString());
    }
}
