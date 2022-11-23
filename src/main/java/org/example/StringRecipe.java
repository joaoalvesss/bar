package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringRecipe{
    private List<StringTransformer> ar;
    StringRecipe(List<StringTransformer> transformers){
        ar = transformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer st : ar){
            st.execute(drink);
        }
    }

}
