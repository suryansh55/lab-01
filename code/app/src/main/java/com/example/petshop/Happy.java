package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    public  Happy(Date valueDate){
        super(valueDate);
    }

    @Override
    public String currentMood() {
        return "happy";
    }

}
