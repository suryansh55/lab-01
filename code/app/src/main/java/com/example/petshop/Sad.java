package com.example.petshop;

import java.util.Date;

public class Sad  extends  Mood{

    public Sad(Date valueDate){
        super(valueDate);
    }

    @Override
    public String currentMood() {
        return "sad";
    }
}
