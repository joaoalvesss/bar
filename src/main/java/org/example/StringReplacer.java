package org.example;

public class StringReplacer implements StringTransformer{
    private char s1;
    private char s2;
    StringReplacer(char m, char n){
        s1 = m;
        s2 = n;
    }
    public void execute(StringDrink drink){
        String s = drink.getText();
        s = s.replace(s1, s2);
        drink.setText(s);
    }
}
