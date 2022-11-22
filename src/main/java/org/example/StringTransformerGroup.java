package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> ar;
    StringTransformerGroup(List<StringTransformer> transformers){
        ar = transformers;
    }

    public void execute(StringDrink drink){
        for(StringTransformer st : ar){
            st.execute(drink);
        }
    }
}
